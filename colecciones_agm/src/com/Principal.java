package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	
	public static void main(String[] args) {
		
		
		//colleciones
		//para declarar una lista
		List<String> lista= new ArrayList<String>();
	
		//array es una clase que representa a la interface list
		
		lista.add("null");
		lista.add ("hola");
		lista.add("texto");
		lista.add ("puebla");
		lista.add("java");
		lista.add ("ya vamonos");
		lista.add(" : (  ");
		lista.add ("aun no");
		//la lista es de objetos tipo string
	
		//imprime la lista
		System.out.println(lista);
	
		//retorna el tamaño de la lista
		System.out.println(lista.size());
		
		//existe o no un elemento dentro de una lista anotar palabra y busca el numero
		System.out.println(lista.contains("java"));
		//busca el numero y me regresa palabra en la posicion que esta
		System.out.println(lista.get(5));
		// me dice en que numero se encuentra el nombre puebla
		System.out.println(lista.indexOf("puebla"));
		System.out.println(lista.lastIndexOf("hola"));
		
		//eliminar elemento
		System.out.println(lista.remove(2));
        System.out.println(lista);	
	//se elimina el comentario:
        System.out.println(lista.remove("ya vamonos"));
        System.out.println(lista);
//reemplaza un elemento con otro en la posicion especificada        
        lista.set(2, "otra cosa");
        System.out.println(lista);
        
        //inserta un elemento en la posicion especificada y desplaza el anterior
        lista.add(5,":)");
        System.out.println(lista);
	//inserta la posicion del 1 al 4
        System.out.println(lista.subList(1, 4));
        
	}
}
