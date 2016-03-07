package org.fiveware.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Substitui o arquivo dispatcher-servlet.xml do projeto configurado com XMLs!
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "org.fiveware" })
public class MyWebConfig extends WebMvcConfigurerAdapter {
 
	/**
	 * Substitui o seguinte trecho:
	 * 
	 * <bean id="jspViewResolver"
	 * class="org.springframework.web.servlet.view.InternalResourceViewResolver"
	 * p:prefix="/WEB-INF/view/"
	 * p:suffix=".jsp" />
	 * 
	 * @return o view resolver
	 */
	@Bean
	public ViewResolver viewResolver() {
 
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
		
	}
	
}