package com;

public class Principal {

	public static void main(String[] args) {
		
		Claseprueba cprueba= new Claseprueba(); //crear objetos en la principal
		
		//cprueba.atributoA=10
				Casainfonavit c1= new Casainfonavit ("Rojo");
				Casainfonavit c2= new Casainfonavit ("Azul");
				Casainfonavit c3= new Casainfonavit ("Verde");
				Casainfonavit c4= new Casainfonavit ("Rosa");
				Casainfonavit c5= new Casainfonavit ("Naranja");
		
				System.out.println(c1.getColor());
				System.out.println(c2.getColor());
				System.out.println(c3.getColor());
				System.out.println(c4.getColor());
				System.out.println(c5.getColor());
				
				
				System.out.println(c1.getM2());
				System.out.println(c2.getM2());
				
				Casainfonavit.m2= 100.5;//una vez impreso el c1 y c2 se hizo cambio y se modifico la dimension
				
				
				System.out.println(c3.getM2());
				System.out.println(c4.getM2());
				System.out.println(c5.getM2());
	
				//con constante NO ES MODIFICABLE EL VALOR 
				
				System.out.println(Casainfonavit.MAX_NUM_PISOS);
				System.out.println(c5.getMaxNumPisos());
				
				
	}
	
}
