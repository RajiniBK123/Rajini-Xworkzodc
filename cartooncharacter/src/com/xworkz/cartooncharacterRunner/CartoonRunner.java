package com.xworkz.cartooncharacterRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartooncharacterDAO.CartoonDAO;
import com.xworkz.cartooncharacterDAO.CartoonDAOImpl;
import com.xworkz.cartooncharacterEntity.CartoonEntity;

public class CartoonRunner
{
  public static void main(String[] args) 
  {
	CartoonEntity entity = new CartoonEntity(1,"Tom","india","male","animated","ramcharan");
	CartoonEntity entity1 = new CartoonEntity(2,"Jerry","india","male","animated","ramcharan");
	CartoonEntity entity2 = new CartoonEntity(3,"Bheem","india","male","animated","ramcharan");
	CartoonEntity entity3 = new CartoonEntity(4,"Raju","india","male","animated","ramcharan");
	CartoonEntity entity4 = new CartoonEntity(5,"Motupatlu","india","male","animated","ramcharan");
	CartoonEntity entity5 = new CartoonEntity(6,"Disney","india","male","animated","ramcharan");
	CartoonEntity entity6 = new CartoonEntity(7,"Barbiedoll","india","male","animated","ramcharan");
	CartoonEntity entity7 = new CartoonEntity(8,"oswald","india","male","animated","ramcharan");
	CartoonEntity entity8= new CartoonEntity(9,"multiRaju","india","male","animated","ramcharan");
	CartoonEntity entity9 = new CartoonEntity(10,"chutti","india","male","animated","ramcharan");
	CartoonDAO dao= new CartoonDAOImpl();
	List<CartoonEntity> list = new ArrayList<CartoonEntity>();
	list.add(entity);
	list.add(entity1);
	list.add(entity2);
	list.add(entity3);
	list.add(entity4);
	list.add(entity5);
	list.add(entity6);
	list.add(entity7);
	list.add(entity8);
	list.add(entity9);
	Boolean save = dao.save(list);
	System.out.println(save);
	CartoonEntity entity11=dao.findByName("Jerry");
	System.out.println(entity11);
	
    Integer inti=dao.total();
     System.out.println(inti);
	
CartoonEntity cartoon =	dao.findByMaxCreatedDate();
	System.out.println(cartoon);

CartoonEntity raji	=dao.findByNameAndCountryAndGenderAndAuthor("Bheem", "india", "male", "ramcharan");
    System.out.println(raji);
	
	String strag=dao.findAuthorByName("ramcharan");
	System.out.println(strag);
	
	LocalDate ld = dao.findCreatedDateByAuthor("ramcharan");
	System.out.println(ld);
	
	Object[] obj = dao.findNameAndCountryByAuthor("ramcharan");
	System.out.println(obj[0]);
	System.out.println(obj[1]);
	
	dao.updateAuthorByName("Disney","chutti");
     dao.updateTypeByName("multiRaju", "oswald");
     dao.deleteByName("Motupatlu");
   dao.findAll().forEach(System.out::println);

  		 dao.findAllAuthor("ramcharan").forEach(System.out::println);

  		 dao.findAllAuthorAndGender("ramcharan","Male").forEach(System.out::println);

  		 dao.findAllName().forEach(System.out::println);

  		 dao.findAllcountry().forEach(System.out::println);

  		dao.findAllNameAndCountry().forEach(object->System.out.println(object[0]+"::"+object[1]));

  		dao.findAllNameAndCountryAndAuthor().forEach(object -> System.out.println(object[0] + "::" + object[1] + "::" + object[2]));

  				
  	}

  

}




