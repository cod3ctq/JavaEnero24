package com;

public class Casainfonavit {

	public static double m2= 65.5;
	public String color;
	public int pisos;
	//CONSTANTES
	public static final int MAX_NUM_PISOS=3;   // es una constante que no va a cambiar
	
	
	//precio
	
	public Casainfonavit() {
		
	}

//using fields
	public Casainfonavit(String color) {
		super();
		this.color = color;
	}

//getter and setters
	public static double getM2() {
		return m2;
	}


	public static void setM2(double m2) {
		Casainfonavit.m2 = m2;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public static int getMaxNumPisos() {
		return MAX_NUM_PISOS;
	}

	@Override
	public String toString() {
		return "Casainfonavit [color=" + color + ", pisos=" + pisos + "]";
	}

	

	
	
	
}
