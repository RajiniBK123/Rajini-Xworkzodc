package com.xworkz.tv;

public class TvRunner 
{
	
		public static void main(String[] args) {

			ApplicationContext container = new ClassPathXmlApplicationContext("configure.xml");
			System.out.println(container);
			TV tv = container.getBean(TV.class);
			System.out.println(tv);

			
		

		}

	}

