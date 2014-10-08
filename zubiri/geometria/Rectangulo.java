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
	
	
public void setbase(double base) 
 {
	this.base = base;
 }	
public void setaltura(double altura)
 {
	this.altura = altura;
 }

public double getbase() 
{
	return base;
}

public double getaltura() 
{
	return altura;
}

public double area() 
{
	area = getBase()*getAltura();
	return area;
}

public double peri() 
{
	peri = 2*getBase()+2*getAltura();
	return peri;
}
}
