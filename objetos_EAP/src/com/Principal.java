package com;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Herencia
		 * Encapsilamiento
		 * Abstraccion
		 * Polimorfismo
		 * */
		
		//Clase
		//Objetos
		//Metodos, retornan un valor o no
		
//		Celular c1 = new Celular();
//		System.out.println(c1);
//		
//		
//		Celular c2 = new Celular("Motorola", "Negro", false, 600, "1100", 100.0);
//		System.out.println(c2);
//		
//		c1.setmAh(650.0);
//		c1.setColor("Blanco");
//		c1.setMarca("ZTE");
//		
//		System.out.println(c1);
//		
//		Computadora pc1 =new Computadora();
//
//		
//		Computadora pc2 = new Computadora("HP", "Gris", 16, true, "b15sadsaf", 2.5, "1080*720", true, 4, 1.250);
//			
//		
//		System.out.println("PC1: "+pc1);		
//		System.out.println("PC2: "+pc2);
//		
//		pc1.marca="DELL";
//		pc1.color="Rojo";
//		pc1.RAM=8;
//		pc1.puertosUSB=5;
//		pc1.Resolucon="750*480";
//		
//		System.out.println("PC1: "+pc1);
		
		//=========================Smartphone ejemplo=====================
	

	//sistema Operativo
		
		Smartphone sm1= new Smartphone();
		
		Pantalla pnt1=new Pantalla("OLED","4k",120,6.8);
		Procesador proc1= new Procesador("Qualcom", 12, 3.5);
		Smartphone sm2= new Smartphone("Samsung", "Blanco", true, 5000, "s23", 200, pnt1, proc1);
		
		System.out.println("PC1: "+sm2);
	//
}
}
