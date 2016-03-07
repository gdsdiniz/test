package org.fiveware.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.fiveware.test.model.ContatoDao;

public class ContatosDao {

	/**
	 * Salva informações do contato no BD
	 * @param contato
	 */
	public void salvar(ContatoDao contato) {
		
		EntityManager em = JPAUtil.getEntityManager();		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(contato);
		tx.commit();
		
		em.close();
	}
	
	
}
