package com.zubiri.geometria;

public class Rectangulo {

	private double base = 0;
	private double altura = 0;
	private double area = 0;
	private double peri = 0;
	
public void setBase(double base) 
 {
	this.base = base;
 }	
public void setAltura(double altura)
 {
	this.altura = altura;
 }

public double getBase() 
{
	return base;
}

public double getAltura() 
{
	return altura;
}

public double Area() 
{
	area = getBase()*getAltura();
	return area;
}

public double Peri() 
{
	peri = 2*getBase()+2*getAltura();
	return peri;
}
}
