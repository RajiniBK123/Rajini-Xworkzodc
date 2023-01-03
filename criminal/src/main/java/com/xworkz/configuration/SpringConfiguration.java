package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.xworkz")
public class SpringConfiguration
{

	public SpringConfiguration() {
		System.out.println("default constructor is created"+this.getClass().getSimpleName());
	}
	@Bean
	
	public ViewResolver resolver()
	{
		System.out.println("creted view resolver");
		return new InternalResourceViewResolver("/",".jsp");
		
	}
	

}
