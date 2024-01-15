package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
	//Lista
		//List es una interface como tal
		//ArrayList es una clase que tiene multiherencia
		
	List<String> lista = new ArrayList<String>();
	
		lista.add("hola");
		lista.add("hola");
		lista.add("texto");
		lista.add("puebla");
		lista.add("java");
		lista.add("ya vamonos");
		lista.add(":(");
		
		//imprime lista
		System.out.println(lista);
		
		//Retorna el tamaño de la lista
		System.out.println(lista.size());
		//Existe o no un elemento dentro de la lista
		System.out.println(lista.contains("java"));
		
		//Devuelve el elemento en la posicion indicada
		System.out.println(lista.get(3));
		
		//Devuelve el indice donde encuentra por primera vez el elemento indicado
		System.out.println(lista.indexOf("hola"));
		
		//Devuelve el indice donde encuentra por ultima vez el elemento indicado
		System.out.println(lista.lastIndexOf("hola"));
		
		//Elimina un elemento por el indice
		System.out.println(lista.remove(2));
		System.out.println(lista);
		
		//Elimina un elemento por el objeto
		System.out.println(lista.remove("ya vamonos"));
		System.out.println(lista);
		
		//Remplaza un elemento por otro en el indice indicado
		lista.set(2, "otra cosa");
		System.out.println(lista);
		
		//Agrega un elemento en el indice indicado, se recorren los objetos
		lista.add(4, ":)");
		System.out.println(lista);

		//Extrae una sub lista de la principal con los indices indicados
		System.out.println(lista.subList(1, 4));

	}

}
