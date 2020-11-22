package com.saviya.admin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.saviya.admin")
public class WebConfig{

	//https://github.com/varuncbv/SPRING-MYSQL-JSP-CRUD-APPLICATION/blob/master/springexample/src/main/webapp/WEB-INF/spring-servlet.xml
	//https://github.com/get2mandar/springmvc-crud-app/blob/master/src/main/java/blog/panditmandar/code/mvcapp/AppConfig.java
	//https://github.com/javabyranjith/spring-framework-mvc/tree/master/springmvc-userlogin
	
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
}
