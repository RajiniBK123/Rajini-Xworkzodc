package com.xworkz.football;

public class FootBall
{
String name;
int price;


  public FootBall(String throwballName)
  {
	 this.name=throwballName; 
	 System.out.println(this.getClass().getSimpleName()+"bean is created");
  }
  public FootBall(String throwballName,int price)
  {
	  this.name=throwballName;
	  this.price=price;
	  System.out.println("name and int is created");
  }
}
