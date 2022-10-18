package com.xworkz.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	private Class[] servletconfigClasses= {SpringConfiguration.class,DBConfiguration.class};
	private String [] servletmappings={"/"};
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("RootConfigClasses is created");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Servlet congig classes is creteed");
		return servletconfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("servlet Mapping clases is created");
		return servletmappings;
	}

}
