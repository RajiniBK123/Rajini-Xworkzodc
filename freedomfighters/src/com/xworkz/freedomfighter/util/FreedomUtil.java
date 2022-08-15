package com.xworkz.freedomfighter.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FreedomUtil
{
 private static EntityManagerFactory factory;
 public static EntityManagerFactory getFactory;
 static
 {
	 Persistence.createEntityManagerFactory("com.xworkz");
 }
}