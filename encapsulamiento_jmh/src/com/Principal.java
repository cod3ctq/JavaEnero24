package com;

public class Principal {
	
	public static void main (String[]args){
		
		ClasePrueba cprueba = new ClasePrueba();
		
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
		
		CasaInfonavit.m2= 100.5;
		System.out.println(CasaInfonavit.MAX_NUM_PISOS);
		
		System.out.println(c3.getM2());
		System.out.println(c4.getM2());
		System.out.println(c4.getMaxNumPisos());
		
		
	}

}
