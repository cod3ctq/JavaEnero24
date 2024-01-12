package com;

public class Principal {
	public static void main(String [] args){
		/* 
		 * Herencia
		 * Encapsulamiento
		 * Abstraccion
		 * Polimorfismo
		 */
		
		//Clase
		//objetos
		//Metodos pueden retornar un valor o no
		Celular_ral c1 = new Celular_ral();
		//System.out.println(c1);
		
		Celular_ral c2 = new Celular_ral("nokia", "rojo", false, 600, "1100", 100.0);
		System.out.println(c2);

	c1.setmAh(650.0);
	c1.setColor("verde");
	c1.setMarca("Sansng");
	
	//Smartphone_ral sm1 = new Smartphone_ral();
	Pantalla_ral pnt1 = new Pantalla_ral ("OLED", "4K", 120, 6.8);
	Procesador_ral proc1 = new Procesador_ral ("qualcom", 12, 3.5);
	
	Smartphone_ral sm2 = new Smartphone_ral("samsung", "blanco", true, 
			5000.0, "S23", 200.00,pnt1,proc1);
	
	System.out.println(sm2);

	
	//System.out.println(c1);
	
	}

}
