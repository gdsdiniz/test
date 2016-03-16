package org.fiveware.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.fiveware.test.business.ContatoBusiness;
import org.fiveware.test.service.ContatoManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class ContatoController {

	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public ModelAndView cadastro() {
		
		ModelAndView mav = new ModelAndView("cadastro");
		
		Map<Integer,String> tipos = new HashMap<Integer,String>();
		tipos.put(1, "residencial");
		tipos.put(2, "comercial");
		tipos.put(3, "movel");
		
		ContatoBusiness contato = new ContatoBusiness();
		
		contato.setSexo('M');
		mav.addObject("cadastroContato", contato);
		mav.addObject("tipos", tipos);
		
		
		return mav;
	}
	
	@RequestMapping("/adicionaContato")
	public @ResponseBody void adiciona(@RequestParam(value = "nome") String nome,
										 @RequestParam(value = "favorito") boolean favorito,
										 @RequestParam(value = "sexo") char sexo,
										 @RequestParam(value = "tipo") String tipo) {

		new ContatoManager().salvarContato(
								new ContatoBusiness(
								nome,
								favorito,
								tipo, 
								sexo));
		
	}
}