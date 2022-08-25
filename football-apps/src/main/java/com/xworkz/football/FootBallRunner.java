package com.xworkz.football;

import javafx.application.Application;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class FootBallRunner {

	public static void main(String[] args) {

	ApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
	  System.out.println(container);
	    FootBall football = container.getBean(FootBall.class);
	    System.out.println(football);

	    Byte b = container.getBean(Byte.class);
	    System.out.println(b);
	    Short s = container.getBean(Short.class);
	    System.out.println(s);
	    Integer in = container.getBean(Integer.class);
	    System.out.println(in);
	    Long l = container.getBean(Long.class);
	    System.out.println(l);
	    Double d = container.getBean(Double.class);
	    System.out.println(d);

	    Float f = container.getBean(Float.class);
	    System.out.println(f);

	    Character c = container.getBean(Character.class);
	    System.out.println(c);

	    Boolean b1=container.getBean(Boolean.class);
	    System.out.println(b1);

	    String s1 = container.getBean(String.class);
	    System.out.println(s1);


