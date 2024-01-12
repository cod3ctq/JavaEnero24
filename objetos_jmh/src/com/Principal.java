package com;

public class Principal {
	
	public static void main (String [] args) {
		
		/*
		 * HERENCIA
		 * ENCAPSULAMIENTO
		 * ABTRACCION
		 * POLIMORFISMO
		 */
		
		//Clase
		//Objetos
		//Mtetodos retornan un valor  o no
		
		Celular c1 = new Celular();
		
		
		Celular c2 = new Celular("Nokia", "Negro", false, 600, "1100", 100.0);
		
		System.out.println(c2);
		
		c1.setMaH(650.0);
		c1.setColor("gris");
		c1.setMarca("ZTE");
		
		
		
		Smartphone sm1 = new Smartphone();
		Pantalla pnt1 = new Pantalla ("OLED", "4K", 120, 6.8);
		Procesador proc1 = new Procesador ("Qualcomm", 12, 3.5);
		Smartphone sm2 = new Smartphone ("SAMSUNG", "BLANCO",true, 5000.0, "S23", 200.00, pnt1,proc1);
		
		
		System.out.println(sm2);
		
//		Libreta l1 = new Libreta ();
//		
//		Libreta l2 = new Libreta ("Scribe", "blanda", 100, "cuadrado", "simple");
//		
//		System.out.println(l2);
//		
//		l1.setContenido(500);
//		l1.setEspiral("doble");
//		l1.setMarca("Norma");
//		
//		System.out.println(l1);

	}

}
