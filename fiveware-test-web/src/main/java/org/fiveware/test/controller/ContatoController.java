package org.fiveware.test.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.fiveware.test.forms.Contato;
import org.fiveware.test.service.ContatoManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class ContatoController {
 
	/*
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String dizHelloWorld(ModelMap model) {
 
		//model.addAttribute("mensagem", "Hello World! Data atual: " + new Date());
		model.addAllAttribute()
		return "cadastro";
	}
	*/
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public ModelAndView cadastro() {
		
		ModelAndView mav = new ModelAndView("cadastro");
		
		Map<Integer,String> tipos = new HashMap<Integer,String>();
		tipos.put(1, "residencial");
		tipos.put(2, "comercial");
		tipos.put(3, "móvel");
		
		Contato contato = new Contato();
		contato.setSexo('M');
		mav.addObject("cadastroContato", contato);
		mav.addObject("tipos", tipos);
		
		
		return mav;
	}
	
	@RequestMapping("adicionaTarefa")
	public String adiciona(Contato contato) {
	
		new ContatoManager().salvarContato(contato);
		
	    return "tarefa/adicionada";
	}
 
}