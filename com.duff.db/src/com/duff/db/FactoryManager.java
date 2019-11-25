package com.duff.db;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jboss.logging.Logger;

import com.duff.db.dao.ProprietaDao;
import com.duff.db.entity.Proprieta;

public class FactoryManager {
	
	public static final String sqlCreateScript = "/com/duff/db/resources/create_tables.sql";
	public static final String sqlUpdateScript = "/com/duff/db/resources/alter_table_#.sql";
	public static final String CHIAVE_VERSIONE_TABELLE = "table_version";
	
	private static final Logger logger = Logger.getLogger("FactoryManager");
	
	private static FactoryManager instance;
	
	private final HashMap<String, EntityManagerFactory> factories;

	private FactoryManager() {
		factories = new HashMap<String, EntityManagerFactory>();
	}

	public static FactoryManager getInstance() {
		if (null == instance) {
			instance = new FactoryManager();
		}
		return instance;
	}
	
	/**
	 * Restituisce l'oggetto <code>EntityManagerFactory</code> a partire dalla persistence unit passata come argomento.
	 * @param persistenceUnitName il nome della persistence unit così come definito nel file persistence.xml.
	 * @return una Factory capace di creare oggetti <code>EntityManager</code>.
	 */
	public EntityManagerFactory getFactory(String persistenceUnitName) {
		if (!factories.containsKey(persistenceUnitName)) {
			logger.info("Istanzio una nuova factory per la persistence unit: '" + persistenceUnitName + "'");
			EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
			factories.put(persistenceUnitName, emf);
			if ("locale".equals(persistenceUnitName)) {
				createLocalDB(emf);
				updateLocalDB(emf);
			}			
		}
		return factories.get(persistenceUnitName);
	}
	
	private void createLocalDB(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		updateLocalDB(em, sqlCreateScript);
	}
	
	private void updateLocalDB(EntityManagerFactory emf) {
		ProprietaDao dao = new ProprietaDao();
		Proprieta versione = dao.trovaDaChiave(CHIAVE_VERSIONE_TABELLE);
		//Se non c'è lo inserisco.
		if (versione == null) {
			versione = inserisciVerioneBase(dao);
		}
		boolean update = true;
		while (update) {
			EntityManager em = emf.createEntityManager();
			String pathUpdate = sqlUpdateScript.replaceFirst("#", versione.getValue());
			update = updateLocalDB(em, pathUpdate);
			if (update) {
				int value = Integer.parseInt(versione.getValue()) + 1;
				versione.setValue(Integer.toString(value));
				versione = dao.aggiorna(versione);
			}
		}
	}
	
	private Proprieta inserisciVerioneBase(ProprietaDao dao) {
		Proprieta versione = new Proprieta();
		versione.setKey(CHIAVE_VERSIONE_TABELLE);
		versione.setValue("1");
		return dao.inserisci(versione);
	}
	
	private boolean updateLocalDB(EntityManager em, String sqlScriptPath) {
		boolean update = false;
		InputStream stream = getClass().getResourceAsStream(sqlScriptPath);
		if (stream != null)	try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
			StringBuffer sb = new StringBuffer();
			String line = reader.readLine();
			while (line != null) {
				sb.append(line);
				line = reader.readLine();
			}
			String scriptSQL = sb.toString();
			String[] scripts = scriptSQL.split(";");
			for (String script : scripts) {
				Query query = em.createNativeQuery(script);
				EntityTransaction transaction = em.getTransaction();
				transaction.begin();
				query.executeUpdate();
				transaction.commit();
			}
			update = true;
			logger.info("Script eseguito!");
		} catch (Exception e) {
			update = false;
			logger.error(e.getMessage(), e);
		} finally {
			em.close();
		}
		return update;
	}

}
