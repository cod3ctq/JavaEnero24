package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		// Para declarar una 
		// LISTA:
		
		List<String> lista = new ArrayList<String>();
		List<String> lista2 = new ArrayList<String>();
		
		// List es una interface, y las interfaces pueden heredar 
		// ArrayList es una clase que hereda de otra abstracta
		
		// ArrayList es la lista mas sencilla de usar y entender
		
		
		// La lista es un objeto que envuelve a otros, en este caso de tipo String
		lista.add("hola");
		lista.add("hola");
		lista.add("texto");
		lista.add("Puebla");
		lista.add("java");
		lista.add("ya vamonos");
		lista.add(":(");
		
		// Imprime la lista
		System.out.println(lista);
		
		// Retorna el size de la lista
		System.out.println(lista.size());
		
		//Para ver si contiene o no algo dentro de la lista:
		System.out.println(lista.contains("java"));
		
		//Para obtener el elemento de esa lista, de acuerdo a su indice
		System.out.println(lista.get(3));
		
		//Te dice el indice de lo que quieres buscar
		System.out.println(lista.indexOf("Puebla"));
		// si tienes un valor repetido, te devolvera el indice de la primera 
		//ocasion donde lo encuentre, por ejemplo "hola"
		
		// Te devuelve la ultima vez que aparece ese elemento "repetido"
		System.out.println(lista.lastIndexOf("hola"));
		
		// Elimina el elemento de acuerdo a su posicion con su indice
		System.out.println(lista.remove(2));
		
		// Para eliminar un elemento especifico, no importa el indice
		// pero remueve el primero que aparece
		System.out.println(lista.remove("ya vamonos"));
		System.out.println(lista);
		
		// Cambiar un dato por otro de acuerdo a su indice
		System.out.println(lista.set(2, "otra cosa"));
		System.out.println(lista);
		
		// Cambiar de acuerdo el indice o agregar en nueva posicion
		// siempre y cuando sea continua o dentro de los indices
		lista.add(5, "no");
		System.out.println(lista);
		
		
		lista2 = lista.subList(1, 4);
		System.out.println(lista2);
		
		
		
		
		
		
		
		
	}

}
