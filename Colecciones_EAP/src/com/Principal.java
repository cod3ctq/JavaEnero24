package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args){
		
		//Lista
		
		List<String> lista= new ArrayList<String>();
		
		//Añadir elementos a la lista
		lista.add("hola");
		lista.add("hola");
		lista.add("texto");
		lista.add("puebla");
		lista.add("java");
		lista.add("ya vamonos");
		lista.add(":(");
		lista.add("hola");
		
		//imprime la lista
		System.out.println(lista);
		
		//Retorna el tamaño de la lista
		System.out.println(lista.size());
		
		//Si existe un elemento o no dento de la lista
		System.out.println(lista.contains("java"));
		
		//Devuelve un elemento a la posicion indicada
		System.out.println(lista.get(3));
		
		//Devuelve el indice donde encuentra por primera vez el elemento indicado
		System.out.println("Primer elemento encontrado en la lista con la cadena 'hola': "+lista.indexOf("hola"));
		//Devuelve el indice donde encuentra por ultima vez el elemento indicado
		System.out.print("Ultimo elemento encontrado en la lista con la cadena 'hola': "+lista.lastIndexOf("hola"));

		
		
		System.out.println(lista.remove(2));
		System.out.println(lista.remove("ya vamonos"));
		System.out.println(lista);
		
		
		//Reemplaza un elemento con otro en la posicion especificada
		lista.set(2, "otra cosa");
		System.out.println(lista);
		
		

		//Inserta un elemento en la posicion especificada y desplaza el elemento anterior
		lista.add(4,":)");
		System.out.println(lista);
		
		//Extrae una lista pequeña en el rango especificado
		System.out.println(lista.subList(1, 4));
	}

}
