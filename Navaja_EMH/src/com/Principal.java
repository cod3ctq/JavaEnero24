package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Navaja n1 = new Navaja();
		System.out.println(n1);
		
//		Procesador proc1 = new Procesador("Qualcomm",12,3.5);
//		Smartphone sm2 = new Smartphone("SAMSUNG", "BLANCO", true, 5000.0, "S23", 200.00,pnt1, proc1);
		
		Desarmador des = new Desarmador("Cruz", 10, .2);
		NavajaSuiza ns = new NavajaSuiza("15", "Damasco", true, des);
		
		System.out.println(ns);
		
	}

}
