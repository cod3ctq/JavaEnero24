package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//Lista
		
		List<String> lista = new ArrayList<String>();
		//Añadir elementos a la lista
		lista.add("Hola");
		lista.add("Hola");
		lista.add("texto");
		lista.add("puebla");
		lista.add("java");
		lista.add("ya vamonos");
		lista.add(":(");
	
		
		//Imprime la lista
		System.out.println(lista);
		
		//Retorna el tamaño de la lista
		System.out.println(lista.size());
		
		//Existe o no un elemento dentro de la lista
		System.out.println(lista.contains("java"));
		
		//Devuelve el elemento en la posicion indicada
		System.out.println(lista.get(3));
		
		//Devuelve el indice donde encuentra por primera vez el elemento indicado
		System.out.println(lista.indexOf("Hola"));
		
		//Devuelve el indice donde encuentra por ultima vez el elemento indicado
		System.out.println(lista.lastIndexOf("Hola"));
		
		//Elimina un elemento por el indice
		System.out.println(lista.remove(2));
		System.out.println(lista);
		
		System.out.println(lista.remove("ya vamonos"));
		System.out.println(lista);
		
		//Reemplaza un elemento con otro en la posicion especificada
		lista.set(2, "otra cosa");
		System.out.println(lista);
		
		//Inserta un elemento en la posicion especificada y desplaza el anterior
		lista.add(5, ":)");
		System.out.println(lista);
		
		System.out.println(lista.subList(1, 4));
		
	}
}
