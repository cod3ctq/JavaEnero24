package com;

public class Principal {
	public static void main(String[]args) {
		
		ClasePrueba cprueba = new ClasePrueba();
		
		
		
		casaInfonavit c1 = new casaInfonavit("Rojo");
		casaInfonavit c2 = new casaInfonavit("Azul");
		casaInfonavit c3 = new casaInfonavit("Verde");
		casaInfonavit c4 = new casaInfonavit("Rosa");
		casaInfonavit c5 = new casaInfonavit("Naranja");
		
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
		System.out.println(c4.getColor());
		System.out.println(c5.getColor());
		
		System.out.println(c1.getM2());
		System.out.println(c2.getM2());
		
		//con "static" el valor cambia para todos pues es universal para la clase
		//De esta manera se declaran los miembros de clase 
		casaInfonavit.m2 =100.5;
		//en este caso no es posible modificar el valor dado que es un "final" al hacerlo marcara error automatico
		//casaInfonavit.MAX_NUM_PISOS=5;
		
		
		System.out.println(c3.getM2());
		System.out.println(c4.getM2());
		
		
		
		//maneras de imprimir una constante
		System.out.println("Numero maximo de pisos: "+c4.getMaxNumPisos());
		System.out.println("Numero maximo de pisos: "+casaInfonavit.MAX_NUM_PISOS);
	}

}
