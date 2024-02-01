package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main (String[]args) {
		
		//Lista
		
		List <String> lista = new ArrayList<String>();
		
		//Añadir elementos a la lista
		lista.add("hola");
		lista.add("hola");
		lista.add("texto");
		lista.add("puebla");
		lista.add("java");
		lista.add("ya vamonos");
		lista.add("hola");
		lista.add(".(");
		
		//Impime la lista
		System.out.println(lista);
		
		//Retorna el tamaño de la lista
		System.out.println(lista.size());
		
		//Existe o no un elemento dentro de la lista
		System.out.println(lista.contains("java"));
		
		//Devuelve el elemnto en la posicion indicada
		System.out.println(lista.get(3));
		
		//Devuelve el indice donde encuentra por primera vez el elemento indicado
		System.out.println(lista.indexOf("hola"));
		
		//Devuelve el indice donde  encuentra por ultima vez el elemento indicie
		System.out.println(lista.lastIndexOf("hola"));
		
		//Elimina un elemento por el indice
		System.out.println(lista.remove(2));
		System.out.println(lista);
		
		//
		System.out.println(lista.remove("ya vamonos"));
		System.out.println(lista);
		
		//Remplaza un elemento con otro en la posicion especficificada
		lista.set(2, "otra cosa");
		System.out.println(lista);
		
		
		//Inserta un elemento en la posicion especificada y desplaza el anterior
		lista.add(4, ":)");
		System.out.println(lista);
		
		//
		System.out.println(lista.subList(1, 4));
	}
	
	

}
