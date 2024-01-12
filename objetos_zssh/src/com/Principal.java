package com;

public class Principal {
	public static void main(String[] args) {
		/*
		*HERENCIA
		*ENCAPSULAMIENTO
		*ABSTRACCION
		*POLIMORFISMO
		*/
		
		//Clase
		//Objetos
		//Metodos, retornan un valor o no
		
		Celular c1 = new Celular();
		//Celular c2 = new Celular(null, null, false, 0, null, 0);
		Celular c2 = new Celular("Nokia", "Negro", false, 600, "1100", 100.0);
		System.out.println(c2);
		
		c1.setmAh(650.0);
		c1.setColor("gris");
		c1.setMarca("ZTE");
		//System.out.println(c1);
		
		

		Smartphone sm1 = new Smartphone();
		Pantalla pnt1 = new Pantalla("OLED", "4K", 120, 6.8);
		Procesador proc1 = new Procesador("Qualcom", 12, 3.5);
		Smartphone sm2 = new Smartphone("Samsung", "Negro", false, 5000., "S23", 200.00, pnt1, proc1);
		
		System.out.println(sm2);
		//sm1.mandarhatsapp("Hola");
		
		//Metodo bolso------------------------------------------------------------------------------------
//		Bolso b = new Bolso();
//		
//		Bolso b1 = new Bolso("MC", "Azul", "Mediano", "Bucket", 399.12, "Piel sintetica", true, "A0001");
//		System.out.println(b1);
//		
//		
//		b.setMarca("CM");
//		b.setColor("Rojo");
//		b.setTamaño("Chico");
//		b.setEstilo("Backpack");
//		b.setPrecio(299.0);
//		b.setModelo("A002");
//		System.out.println(b);
		
		
		
		
		
	}//main
}
