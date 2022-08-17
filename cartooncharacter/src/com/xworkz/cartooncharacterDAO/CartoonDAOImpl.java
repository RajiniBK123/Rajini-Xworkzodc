package com.xworkz.cartooncharacterDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import com.xworkz.cartooncharacter.util.CartoonUtil;
import com.xworkz.cartooncharacterEntity.CartoonEntity;
import static com.xworkz.cartooncharacterEntity.CartoonEntity.*;
public  class CartoonDAOImpl implements CartoonDAO

{
	EntityManagerFactory factory = getFactory();
{
  
}

@Override
public boolean save(List<CartoonEntity> entities)
{
	EntityManager manager=null;
	try{
	manager = factory.createEntityManager();
	EntityTransaction tx = manager.getTransaction();
	tx.begin();
    for(CartoonEntity cartoonEntity : entities){
    	manager.persist(cartoonEntity);
    }
	tx.commit();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
	  manager.close();
	}
	return false;
}

private EntityManagerFactory getFactory() {
	// TODO Auto-generated method stub
	return null;
}


}
