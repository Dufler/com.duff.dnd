package com.duff.db;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.logging.Logger;

public abstract class ReadOnlyDao<T> extends Dao {

	private static final Logger logger = Logger.getLogger("ReadOnlyDao");

	protected final Class<T> c;

	public ReadOnlyDao(String persistenceUnit, Class<T> c) {
		super(persistenceUnit);
		this.c = c;
	}

	/**
	 * Restituisce tutte le entity esistenti.
	 * 
	 * @return una lista di entities o <code>null</code> in caso di errori.
	 */
	protected List<T> findAll() {
		List<T> lista;
		EntityManager em = getManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<T> criteria = cb.createQuery(c);
			Root<T> member = criteria.from(c);
			criteria.select(member);
			lista = em.createQuery(criteria).getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			lista = null;
		} finally {
			em.close();
		}
		return lista;
	}

	/**
	 * Restituisce tutte le entity esistenti che hanno una certa proprietà.
	 * 
	 * @return una lista di entities o <code>null</code> in caso di errori.
	 */
	protected List<T> findAllEqualTo(String columnName, Object value) {
		List<T> lista;
		EntityManager em = getManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<T> criteria = cb.createQuery(c);
			Root<T> member = criteria.from(c);
			criteria.select(member).where(cb.equal(member.get(columnName), value));
			lista = em.createQuery(criteria).getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			lista = null;
		} finally {
			em.close();
		}
		return lista;
	}

	/**
	 * Restituisce la prima entity esistente che ha quella proprietà.<br>
	 * Il numero massimo di entity che verranno restituite è 1 anche se potrebbero
	 * corrispoderne di più.
	 * 
	 * @return una entity o <code>null</code> in caso di errori o nessuna
	 *         corrispondenza.
	 */
	protected T findFirstOneEqualTo(String columnName, Object value) {
		T entity;
		EntityManager em = getManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<T> criteria = cb.createQuery(c);
			Root<T> member = criteria.from(c);
			criteria.select(member).where(cb.equal(member.get(columnName), value));
			List<T> lista = em.createQuery(criteria).setMaxResults(1).getResultList();
			entity = lista.isEmpty() ? null : lista.get(0);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			entity = null;
		} finally {
			em.close();
		}
		return entity;
	}

	/**
	 * Restituisce la prima entity esistente che ha quella proprietà.<br>
	 * Il numero massimo di entity che verranno cercate è 1.
	 * 
	 * @return una entity o <code>null</code> in caso di errori o nessuna
	 *         corrispondenza.
	 */
	protected T findOnlyOneEqualTo(String columnName, Object value) {
		T entity;
		EntityManager em = getManager();
		try {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<T> criteria = cb.createQuery(c);
			Root<T> member = criteria.from(c);
			criteria.select(member).where(cb.equal(member.get(columnName), value));
			List<T> lista = em.createQuery(criteria).setMaxResults(2).getResultList();
			entity = lista.size() == 1 ? lista.get(0) : null;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			entity = null;
		} finally {
			em.close();
		}
		return entity;
	}

	/**
	 * Cerca la specifica entity usando la chiave passata come argomento.
	 * 
	 * @param id il valore di chiave che identifica la entity desiderata.
	 * @return la entity trovata o <code>null</code> se non ci sono corrispondenze o
	 *         in caso di errori.
	 */
	protected T findByID(Object id) {
		EntityManager em = getManager();
		T entity;
		try {
			entity = em.find(c, id);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			entity = null;
		} finally {
			em.close();
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	protected T findOneWithNamedQuery(String namedQuery, Map<String, Object> parameters) {
		T entity;
		EntityManager em = getManager();
		try {
			Query query = em.createNamedQuery(namedQuery);
			// Se sono stati passati dei parametri li imposto.
			if (parameters != null && !parameters.isEmpty())
				for (String name : parameters.keySet())
					query.setParameter(name, parameters.get(name));
			entity = (T) query.getSingleResult();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			entity = null;
		} finally {
			em.close();
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	protected List<T> findWithNamedQuery(String namedQuery, Map<String, Object> parameters, Integer maxResult) {
		List<T> entities;
		EntityManager em = getManager();
		try {
			Query query = em.createNamedQuery(namedQuery);
			// Se sono stati passati dei parametri li imposto.
			if (parameters != null && !parameters.isEmpty())
				for (String name : parameters.keySet())
					query.setParameter(name, parameters.get(name));
			// Se c'è un massimo di risultati lo imposto
			if (maxResult != null && maxResult > 0)
				query.setMaxResults(maxResult);
			entities = query.getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			entities = null;
		} finally {
			em.close();
		}
		return entities;
	}

}
