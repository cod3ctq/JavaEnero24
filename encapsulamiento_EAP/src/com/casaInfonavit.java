package com;

public class casaInfonavit {
	
	public static double m2=65.5;
	public String color;
	public static final int MAX_NUM_PISOS=3;
	//precio
	
	public casaInfonavit() {
		
	}

	public casaInfonavit(String color) {
		super();
		this.color = color;
	}

	public static double getM2() {
		return m2;
	}

	public static void setM2(double m2) {
		casaInfonavit.m2 = m2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	public static int getMaxNumPisos() {
		return MAX_NUM_PISOS;
	}

	@Override
	public String toString() {
		return "casaInfonavit [color=" + color + "]";
	}



	
}
