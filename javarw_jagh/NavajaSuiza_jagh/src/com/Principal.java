package com;

public class Principal {

	public static void main(String[] args) {
	
		Navaja ns1 = new Navaja();
		Navaja ns2 = new Navaja("Victorinos", "Negro", "Tradicional-87", false, 185.12, "7piezas");
		System.out.println(ns2);
		
		sacaCorchos sc1 = new sacaCorchos();
		sacaCorchos sc2 = new sacaCorchos("acero", "plata", true, "1");
		System.out.println(sc2);
		
		Desarmador d2 = new Desarmador("Acero", "Plata", false, 3.5);
		System.out.println(d2);
		
		abreLatas al1 = new abreLatas("acero", "plata", 3);
		System.out.println(al1);
	}
	
	
	
	
	
	}
