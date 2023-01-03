package com.xworkz.login.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@ComponentScan(basePackages="com.xworkz")
@Configuration
public class SpringConfiguration
{
 
	public void SpringConfiguration()
	{
		System.out.println("default constructor is created"+this.getClass().getSimpleName());
	}
	@Bean
	  public ViewResolver viewResolver()
	  {
		  System.out.println("Calling View Resolver");
		  return new InternalResourceViewResolver("/",".jsp");     
	  }
	
	@Bean
	public  MultipartResolver multipart()
	{
		System.out.println("Calling MultiPartResolver");
		return new StandardServletMultipartResolver();
	}
	
	
	
	
}
