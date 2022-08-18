package com.xworkz.cartooncharacterDAO;


import java.time.LocalDate;
import java.util.List;

import com.xworkz.cartooncharacterEntity.CartoonEntity;
public interface CartoonDAO 
{
  boolean save(List<CartoonEntity> entities);
  CartoonEntity findByName(String name);
	
	Integer total();
	
	CartoonEntity findByMaxCreatedDate();
	
	CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country,String gender,String author);

	String findAuthorByName(String name);//
	
	Object[] findNameAndCountryByAuthor(String author);
	
	LocalDate findCreatedDateByAuthor(String author);
	
	void updateAuthorByName(String newAuthor,String name);
	
	void updateTypeByName(String newType,String name);
	
	void deleteByName(String name);
	
	List <CartoonEntity> findAll();
	List<CartoonEntity> findAllAuthor(String author);
	List<CartoonEntity> findAllAuthorAndGender(String author,String gender);
	List<String> findAllName();
	List<String> findAllcountry();
	List<Object[]>findAllNameAndCountry();
	default List<Object[]> findAllNameAndCountryAndAuthor()
	{
		return null;
	}
	
	

}
