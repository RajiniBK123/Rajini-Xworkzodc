package com.xworkz.cartooncharacterDAO;


import java.util.List;

import com.xworkz.cartooncharacterEntity.CartoonEntity;
public interface CartoonDAO 
{
  boolean save(List<CartoonEntity> entities);
}
