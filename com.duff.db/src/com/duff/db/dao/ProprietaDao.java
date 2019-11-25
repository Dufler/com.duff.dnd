package com.duff.db.dao;

import com.duff.db.CRUDDao;
import com.duff.db.entity.Proprieta;

public class ProprietaDao extends CRUDDao<Proprieta> {

	public ProprietaDao() {
		super(LOCAL_PERSISTENCE_UNIT_NAME, Proprieta.class);
	}

	@Override
	protected void updateValues(Proprieta oldEntity, Proprieta entity) {
		oldEntity.setValue(entity.getValue());		
	}

	public Proprieta trovaDaChiave(String chiaveVersioneTabelle) {
		Proprieta entity = findByID(chiaveVersioneTabelle);
		return entity;
	}

	public Proprieta aggiorna(Proprieta versione) {
		Proprieta entity = update(versione, versione.getKey());
		return entity;
	}

	public Proprieta inserisci(Proprieta versione) {
		Proprieta entity = insert(versione);
		return entity;
	}

}
