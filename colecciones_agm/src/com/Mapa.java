package com;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> lista2 = new HashMap<Integer, String>();
		
		lista2.clear();
		lista2.get("hola");
		lista2.get("como estan");
		lista2.get("que hacen");
		lista2.get("oyeee");
		
		
//		// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
//		
//		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
//		
//		nombreMap.size(); // Devuelve el numero de elementos del Map
//		
//		nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
//		
//		nombreMap.put(K clave, V valor); // Añade un elemento al Map
//		
//		nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
//		
//		nombreMap.clear(); // Borra todos los componentes del Map
//		
//		nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
//		
//		nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
//		
//		nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
//		
//		nombreMap.values(); // Devuelve una "Collection" con los valores del Map
//		
}
}
