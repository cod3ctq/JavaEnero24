package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapa {
	public static void main(String[] args) {
		
//		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Lamborgini");		
		map.put(2, "Ferrari");		
		map.put(3, "Porche");	
		map.put(4, "McClaren");		
		map.put(5, "Koenisseg");		
		map.put(6, "Buggati");
		map.put(7, "Saleen");
		map.put(8, "Maserati");
		map.put(9, "Pagani");

		// Imprimimos el Map con un Iterador
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
		  Integer key = it.next();
		  System.out.println("Posicion " + key + " Valor: " + map.get(key));
		}
		
		//		nombreMap.size(); // Devuelve el numero de elementos del Map
		System.out.println(map.size());
		
//		nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
		System.out.println(map.isEmpty());
		
//		nombreMap.put(K clave, V valor); // Añade un elemento al Map
		map.put(10, "Bentley");
		  System.out.println(map.values());
		
		  
//		nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
		  System.out.println(map.get(2)); //key no funciona como array, depende del valor de la clave
		  
//		nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
		  System.out.println(map.containsKey(6));
	
//		nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
		  System.out.println(map.containsValue("Buggati"));
		  
//		nombreMap.values(); // Devuelve una "Collection" con los valores del Map 
		  System.out.println(map.values());
				
//		nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
		  map.remove(10);
		  System.out.println(map.values());
		  
		  
//		nombreMap.clear(); // Borra todos los componentes del Map
		  map.clear();
		  System.out.println(map.isEmpty());
		  System.out.println(map.values());
		
		
		
	}

}
