package com.duff.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jboss.logging.Logger;

public class Dao {
	
	private static final Logger logger = Logger.getLogger("Dao");

	public static final String LOCAL_PERSISTENCE_UNIT_NAME = "locale";

	protected final String persistenceUnit;

	/**
	 * Costruttore di default.<br>
	 * La persistence unit passata come argomento fornisce indicazioni su quale db
	 * andare ad utilizzare.
	 * 
	 * @param persistenceUnit identifica il nome della Persistence Unit cos� come
	 *                        definita nel file persistence.xml
	 */
	public Dao(String persistenceUnit) {
		this.persistenceUnit = persistenceUnit;
	}

	/**
	 * Restituisce un oggetto <code>EntityManager</code> da utilizzare per eseguire
	 * l'accesso ai dati.<br>
	 * E' molto importante chiudere tramite il metodo <code>close</code> l'oggetto
	 * una volta concluso l'utilizzo.
	 * 
	 * @return L'oggetto utilizzabile per l'accesso ai dati.
	 */
	protected EntityManager getManager() {
		EntityManager em = FactoryManager.getInstance().getFactory(persistenceUnit).createEntityManager();
		return em;
	}

	protected Connection getConnection() {
		String url = "jdbc:sqlite:C:/logica/db/logica.db";
		Connection connection;
		try {
			connection = DriverManager.getConnection(url);
		} catch (Exception e) {
			connection = null;
			logger.error(e.getMessage(), e);
		}
		return connection;
	}

	/**
	 * Esegue le query nativa specificata.
	 * 
	 * @param nativeQuery la String contenente codice SQL da eseguire.
	 * @return l'esito dell'operazione.
	 */
	protected boolean executeNativeQuery(String nativeQuery) {
		boolean result;
		EntityManager em = getManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			Query query = em.createNativeQuery(nativeQuery);
			transaction.begin();
			query.executeUpdate();
			transaction.commit();
			result = true;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			if (transaction != null && transaction.isActive())
				transaction.rollback();
			result = false;
		} finally {
			em.close();
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	protected List<Object[]> executeNativeSearch(String nativeQuery) {
		List<Object[]> results;
		EntityManager em = getManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			results = em.createNativeQuery(nativeQuery).getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			if (transaction != null && transaction.isActive())
				transaction.rollback();
			results = null;
		} finally {
			em.close();
		}
		return results;
	}
	
	/**
	 * Esegue una transazione.<br>
	 * Le istruzioni contenute nella transazione passata come argomento vengono eseguite in maniera transazionale dentro un try-catch-finally.<br>
	 * Non � necessario preoccuparsi di gestire la transazione, basta solo scrivere il codice da eseguire.
	 * @param transazione l'oggetto che contiene le istruzioni da eseguire.
	 * @return l'esito della transazione.
	 */
	public boolean executeTransaction(Transazione transazione) {
		boolean result;
		EntityManager em = getManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			transazione.esegui(em);
			transaction.commit();
			result = true;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			if (transaction != null && transaction.isActive())
				transaction.rollback();
			result = false;
			transazione.setEccezione(e);
		} finally {
			if (em.isOpen())
				em.close();
			transazione.chiudi();
		}
		return result;
	}

}
