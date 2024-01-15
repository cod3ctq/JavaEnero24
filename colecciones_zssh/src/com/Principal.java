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
	
	//imprime lista
	System.out.println(lista);
	//Imprime tamaño de la lista
	System.out.println(lista.size());
	//Existe o no dentro de la lista
	System.out.println(lista.contains("java"));
	//Devuelve un elemento en la posicion
	System.out.println(lista.get(3));
	//Este metodo puede lanzar una exxepcion
	//System.out.println(lista.get(90));
	//Devuelve el indice donde encuentra por primera vez el elemento indicado
	System.out.println(lista.indexOf("Hola"));
	//Devuelve el indice donde encuentra por ulrim vez el elemento
	System.out.println(lista.lastIndexOf("Hola"));
	//Elimina un elemento por el indice
	System.out.println(lista.remove(2));
	System.out.println(lista);
	//Elimina un elemento por el contenido
	System.out.println(lista.remove("ya vamonos"));
	System.out.println(lista);
	//lo remplaza un elemento con otro en la posicion especifica
	lista.set(2, "otra cosa");
	System.out.println(lista);
	//inserta un elemento en la posicion especificada al anterior
	lista.add(4, ":)");
	System.out.println(lista);
	//
}
}
