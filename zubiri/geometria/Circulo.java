package com.zubiri.geometria;

public class Circulo {

	static final double NUM_PI =3.1416;

	private double radio, area, circu;

	public Circulo(double radio)
 {
	area=0;
	circu=0;
	setRadio(radio);
 }
	
public void setRadio(double radio) 
 {
	this.radio = radio;
 }
 
public double Area() 
 {	
	area = NUM_PI*radio*radio;
	return area;
 }
 
public double Circu() 
 {	
	circu = 2*NUM_PI*radio;
	return circu;
 }
}
