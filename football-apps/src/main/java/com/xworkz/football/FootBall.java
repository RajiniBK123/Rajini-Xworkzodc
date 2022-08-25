package com.xworkz.football;

public class FootBall
{
String name;
private String brand;
private Double price;



public FootBall() {
	System.out.println(this.getClass().getSimpleName());
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public Double getPrice() {
	return price;
}


public void setPrice(Double price) {
	this.price = price;
}


@Override
public String toString() {
	return "FootBall [brand=" + brand + ", price=" + price + "]";
}
}


