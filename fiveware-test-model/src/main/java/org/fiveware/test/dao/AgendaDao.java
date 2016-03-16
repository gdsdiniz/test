package org.fiveware.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AgendaDao {

	/**
	 * Salva informações do contato no BD
	 * @param contato
	 */
	public void salvar(Object contato) {
		
		EntityManager em = JPAUtil.getEntityManager();		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(contato);
		tx.commit();
		
		em.close();
	}
	
	
}
