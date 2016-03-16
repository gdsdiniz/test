package org.fiveware.test.service;

import org.fiveware.test.business.ContatoBusiness;
import org.fiveware.test.dao.AgendaDao;
import org.fiveware.test.model.ContatoDao;
import javax.persistence.Entity;

/**
 * Faz a comunicação entre o controle e o model
 * @author Bruno
 *
 */
public class ContatoManager {

	/**
	 * 
	 * @param contato
	 */
	public void salvarContato(ContatoBusiness contato) {
		
		ContatoDao contatoDao = new ContatoDao(contato.getNome(),
											   contato.isFavorito(),
											   contato.getTipo(),
											   contato.getSexo());
		
		new AgendaDao().salvar(contatoDao);
		
	}
		
}
