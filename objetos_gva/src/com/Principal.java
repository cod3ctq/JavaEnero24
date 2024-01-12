package com;

public class Principal {
	public static void main(String[] args) {
		
		/*
		 * Pilares de la orientacion a objetos
		 * 
		 * HERENCIA (Especializar un modelo)
		 * Sirve tambien para crear una jerarquia de clases
		 * 
		 * ENCAPSULAMIENTO
		 * ABSTRACCION
		 * POLIMORFISMO
		 * 
		 */
		
		// Clase (creamos un tipo de dato llamado celular con ciertos atributos)
		
		// Objetos
		// Metodos, que retornan un valor o no
		
		// se llama la clase, y luego al constructor despues de new
		Celular c1 = new Celular();
//		System.out.println(c1);
		
		Celular c2 = new Celular("Nokia", "Negro", false, 600, "1100", 100.0);
		System.out.println(c2);
//		
		c1.setmAh(650.0);// para introducir un valor al c1
		c1.setColor("Gris");
		c1.setMarca("ZTE");
		
		Smartphone sm1 = new Smartphone();
		Pantalla pnt1 = new Pantalla("OLED", "4K", 120, 6.8);
		Procesador proc1 = new Procesador("Qualcomm", 12, 3.5);
		
		Smartphone sm2 = new Smartphone("Apple", "Negro", true, 5000.0, "13 Pro", 200.0,
				pnt1, proc1); // para poner objetos, primero hay que declararlos para
		//despues pasarlos como argumentos en esta linea
		System.out.println();
		System.out.println(sm2);
		// En java no existe la multiherencia, pero en otros si
		// Solo se puede simular.
		
//		System.out.println(c1);
		
//		
//		Videojuego v1 = new Videojuego();
//		System.out.println(v1);
//		Videojuego v2 = new Videojuego("Microsoft", true, "PC, Xbox", 23.76, "RTS", 2017, "Steam");
//		System.out.println(v2);
		
		
	}

}
