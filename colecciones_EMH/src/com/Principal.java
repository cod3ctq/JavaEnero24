package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		//LIsta
		
		List<String> lista = new ArrayList<String>();
		
		//Añadir elementos a la lista
		lista.add("hola");
		lista.add("hola");
		lista.add("adios");
		lista.add("Puebla");
		lista.add("Java");
		lista.add("ya vamonos");
		lista.add(":(");
		
		
		//Imprime la lista
		System.out.println(lista);
		
		//Retorna el tamaño de la lista
		System.out.println(lista.size());
		
		//Existe o no un elemento dentro de la lista. Retorna boolean
		System.out.println(lista.contains("Java"));
		
		//Retorna posiciones especificas de una lista 
		System.out.println(lista.get(3));
		
		//Busca el indice en donde se encuentra un dato. Si el dato se repite solo retorna el primero encontrado
		System.out.println(lista.indexOf("Puebla"));
		
		
		System.out.println(lista.isEmpty());
		
		//Retorna a la inversa un dato buscado
		System.out.println(lista.lastIndexOf("hola"));
		
		//Metodo polimorfico
		//Metodo para eliminar un elemento por el indice
		System.out.println(lista.remove(2));
		System.out.println(lista);
		
		
		System.out.println(lista.remove("ya vamonos"));
		System.out.println(lista);
		
		
		lista.set(0, "sou nuevo");
		System.out.println(lista);
		
		
		//Reemplaza un elemento con otro en la posicion especificada y lo desplaza
		//Si se inserta en la ultima posicion solo se agregara este nuevo elemento a la lista 
		lista.add(5, "jelow");
		System.out.println(lista);
		
		
		System.out.println(lista.subList(1, 4));
		
	}

}
