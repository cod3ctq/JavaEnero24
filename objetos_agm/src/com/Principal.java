package com;

public class Principal {

	public static void main (String[] args) {
	/*
	pilares orientadas a objetos son:
	HERENCIA
	ENCAPSULAMIENTO
	ABSTRACCION
	POLIMORFISMO
	*/
		
		//CLASE
		//OBJETOS
		//METODOS QUE RETORNAN UN VALOR O NO
		
		
		Celular c1=new Celular(null, null, false, 0, null, 0);// esta refenciando a la otra clase
		System.out.println(c1);
	    
		Celular c2 =new Celular("Nokia", "Negro",false,600.0,"1100",100.0); //extraer las variables de la clase Celular y solo darle los datos
	    System.out.println(c2);//se imprime
	
	c1.setmAh(650.0);//como es double tiene que ser decimal y ayuda con el Gettery setters
	c1.setColor("gris");
	c1.setMarca("ZTE");
	//c1.//con c1.te arroja los metodos por lo que se considero de la pagina referenciada  
	System.out.println(c1);
	
	
	Ropa r1=new Ropa("lana","rojo",true,"cocktel",true);
			System.out.println(r1);
	
			
	Smartphone sm1=new Smartphone();
	Pantalla pnt1 =new Pantalla ("OLED", "4k", 120, 6.8);
	Procesador proc1= new Procesador ("Qualcomm",12, 3.5);
	
	
	
	Smartphone sm2= new Smartphone ("SAMSUNG", "BLANCO",true, 5000.0,"S23",200.00,        pnt1,proc1);
	
	System.out.println(sm2);//solo muestra los atributos a los que le pertenece
	}
}
