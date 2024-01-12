package com;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 *  H   erencia
		 *  E   ncapsulamiento
		 *  A	bstraccion
		 *  P   olimorfismo
		*/
		
		//Clase
		//Objeto
		//Metodos, retornan un valor o no
		
		Celular c1 = new Celular();
		System.out.println(c1);
		
		
		Celular c2 = new Celular("Nokia", "Negro", false, 600, "1100", 100.0);
		System.out.println(c2);
		
		c1.setmAh(1520.5);
		c1.setColor("Azul");
		c1.setMarca("ZTE");
		//System.out.println(c1);
		
		
		Smartphone sm1 = new Smartphone();
		// sm1 hereda todo lo construido en Celular(), se aplica herencia
		
		
		Pantalla pnt1 = new Pantalla("OLED","4K", 120,6.8);
		Procesador proc1 = new Procesador("Qualcomm",12,3.5);
		Smartphone sm2 = new Smartphone("SAMSUNG", "BLANCO", true, 5000.0, "S23", 200.00,pnt1, proc1);
		
		System.out.println(sm2);
		
		
		
		
		

	}
	
	
}
