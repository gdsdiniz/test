package org.fiveware.test.service;

import java.util.List;

import org.fiveware.test.dao.ContatosDao;
import org.fiveware.test.forms.Contato;
import org.fiveware.test.model.ContatoDao;

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
	void salvarContato(Contato contato) {
		
		ContatoDao contatoDao = new ContatoDao(contato.getNome(),
											   contato.isFavorito(),
											   contato.getTipo(),
											   contato.getSexo());
		
		new ContatosDao().salvar(contatoDao);
		
	}
	
	/*
	private List<ContatoDao> listar() {
		
	}*/
	
}
