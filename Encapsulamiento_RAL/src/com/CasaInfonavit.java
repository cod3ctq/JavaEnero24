package com;

public class CasaInfonavit {

	public static double m2= 65.5; //mienbro de clase, se pueden modificar o reasignar
	public String color;
	//CONSTANTES
	public static final int MAX_NUM_PISOS=3; //final da atributos inmutables o constantes que no se pueden modficiar
	//presio
	
	public CasaInfonavit() {
		
	}
	public CasaInfonavit(String color) {
		super();
		this.color = color;
	}
	public static double getM2() {
		return m2;
	}
	public static void setM2(double m2) {
		CasaInfonavit.m2 = m2;
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
		return "CasaInfonavit [color=" + color + "]";
	}
	

	
}
