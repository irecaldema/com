package com.zubiri.geometria;

public class Rectangulo {

	private double base, altura, area, peri ;

	public Rectangulo(double base, double altura)
 {
	area=0;
	peri=0;
	setBase(base);
	setAltura(altura);
 }
	
	
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
