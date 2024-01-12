package com;

public class Principal {
	
	public static void main(String[] args) {
		
		ClasePrueba cprueba = new ClasePrueba();
		
		//cprueba.atributoA = 10;
		CasaInfonavit c1 = new CasaInfonavit("Rojo");
		CasaInfonavit c2 = new CasaInfonavit("Azul");
		CasaInfonavit c3 = new CasaInfonavit("Verde");
		CasaInfonavit c4 = new CasaInfonavit("Rosa");
		CasaInfonavit c5 = new CasaInfonavit("Naranja");
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
		System.out.println(c4.getColor());
		System.out.println(c5.getColor());
		
		System.out.println(c1.getM2());
		System.out.println(c2.getM2());
		
		CasaInfonavit.m2 = 100.5;
		
		System.out.println(c3.getM2());
		System.out.println(c4.getM2());
		System.out.println(c5.getM2());
		
		
		System.out.println(CasaInfonavit.MAX_NUM_PISOS);
		//CasaInfonavit.MAX_NUM_PISOS = 5;
		
		System.out.println(c1.getMaxNumPisos());
		
		//¿Como puedes declarar miembros de clase?
		//¡Como puedo restringir la visibilidad de clases del mismo paquete
		//¡Cuantas clases puedo heredar en una clase R: 1
		//No esta a la vista la palabra reservada extense, esta heredando?
		//Modificador final tiene tres niveles de accion
		//Es pal lunes, tranqui
		
	}
	
	
}
