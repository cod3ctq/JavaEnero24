package com;

public class Principal {
	
	public static void main(String[] args) {
		
		ClasePrueba cprueba = new ClasePrueba();
		
		CasaInfonavit c1 = new CasaInfonavit("Red");
		CasaInfonavit c2 = new CasaInfonavit("Azul");
		CasaInfonavit c3 = new CasaInfonavit("Orange");
		CasaInfonavit c4 = new CasaInfonavit("White");
		CasaInfonavit c5 = new CasaInfonavit("Salmon");
		
		System.out.println(c1.getColor());
		System.out.println(c2.getM2());
		System.out.println(c3.getM2());
		
		CasaInfonavit.m2 = 100.5;
		System.out.println(CasaInfonavit.MAX_NUM_PISOS);
		// Los valores estaticos los gobierna la clase
		
		System.out.println(c4.getM2());
		System.out.println(c5.MAX_NUM_PISOS); // o c5.getMaxNumPisos()
		
		
		/*
		 * Declarar un miembro de clase se usa "static"
		 * 
		 * Para que no cambie o sea inmutable, que sea un "final"
		 * 
		 * Hay 2 tipos de herencias, la explicita es cuando tienes el extends a la vista
		 * 
		 * pero cuando solo tienes ClassA, y no tienes el extends, tienes la herencia
		 * de Object[]
		 * 
		 * 
		 * Modificador final tiene 3 nivels
		 * A nivel de atributo crea constantes, cuales son los otros 2?
		 */
	}

}
