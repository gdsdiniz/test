package org.fiveware.test.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Grande parte das configurações dessa classe já estão feitas na classe abstrata que extendemos!
 * 
 * O que está configurado aqui é o que estaria no web.xml!
 */


public class MyWebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	/**
	 * 
	 * Nesse método retornamos a classe que contém as configurações
	 * que estavam no arquivo dispatcher-servlet.xml do projeto anterior configurado com XMLs!
	 * 
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { MyWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}