package com;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		//añadir elementos
		mapa.put(1,"Zuri");
		mapa.put(2,"Sadai");
		mapa.put(3,"Silva");
		mapa.put(4,"Hinojosa");
		mapa.put(5,"Hernandez");
		mapa.put(6,"Laura");
		
		//Devuelve el tamaño
		System.out.println(mapa.size());
//		//Devuelve true si no hay elementos en el Map y false si si los hay 
//		System.out.println(mapa.isEmpty());
//		// Añade un elemento al Map
		mapa.put(7 , "Danny" );
//		// Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
		System.out.println(mapa.get(4));
//		// Borra todos los componentes del Map
//		//mapa.clear();
//		// Borra el par clave/valor de la clave que se le pasa como parámetro
//		mapa.remove(7);
//		// Devuelve true si en el map hay una clave que coincide con K
//		mapa.containsKey(2);
//		// Devuelve true si en el map hay un Valor que coincide con V
//		mapa.containsValue("Sadai");
		// Devuelve una "Collection" con los valores del Map
		System.out.println(mapa.values());
		
		
		
	}
}
