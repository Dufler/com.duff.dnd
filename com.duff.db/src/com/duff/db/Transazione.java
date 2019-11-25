package com.duff.db;

import javax.persistence.EntityManager;

/**
 * Classe astratta da implementare per eseguire metodi transazionali secondo lo schema try-catch-finally presente in <code>Dao</code>.<br>
 * Non è necessario preoccuparsi di gestire la transazione, basta solo scrivere il codice da eseguire.
 * @author Damiano
 *
 */
public abstract class Transazione {

	protected Throwable eccezione;
	
	/**
	 * Metodo da implementare dove eseguire le istruzioni da rendere transazionali.<br>
	 * Non è necessario istanziare una transazione tramite il metodo <method>getTransaction()</method> e non è necessario chiudere l'entity manager tramite il metodo<method>close()</method>.
	 * @param em l'entity manager da usare per eseguire le istruzioni.
	 */
	protected abstract void esegui(EntityManager em);
	
	/**
	 * Metodo da implementare che viene richiamato in caso di errore. 
	 * @param t l'eccezione che si è generata durante l'esecuzione delle istruzioni.
	 */
	protected abstract void gestisciErrore(Throwable t);
	
	/**
	 * Metodo da implementare che viene richiamato nel finally in modo da essere sempre eseguito.
	 */
	protected abstract void chiudi();
	
	protected void setEccezione(Throwable t) {
		eccezione = t;
		gestisciErrore(t);
	}

	public Throwable getEccezione() {
		return eccezione;
	}

}
