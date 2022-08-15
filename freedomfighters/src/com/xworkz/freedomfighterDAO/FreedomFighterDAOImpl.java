package com.xworkz.freedomfighterDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class FreedomFighterDAOImpl 
{
  try
  {
	 	 EntityManager manager=Factory.createEntityManager(); 
  }
  catch(PersistenceException e)
  {
	 e.printStackTrace(); 
  }
  finally{
	  
  }
}
