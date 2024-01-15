package COM;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		//Lista 
		
		List<String> lista = new ArrayList<String>();
		
		//añadir elementos a la lista
		lista.add("hola");
		lista.add("hola");
		lista.add("texto");
		lista.add("puebla");
		lista.add("java");
		lista.add("ya vamonos");
		lista.add("hola");
		lista.add(":(");
		
		//Imprime la lista
		System.out.println(lista);
		
		//Retorna el tamaño de la lista
		System.out.println(lista.size());
		
		//Existe o no un elemento dentro de la lista 
		System.out.println(lista.contains("java"));
		
		//Devuelve el elemento de la posicion indicada
		System.out.println(lista.get(3));
		
		//devuelve el indice donde encuentra por primera vez el elemento indicado 
		System.out.println(lista.indexOf("hola"));
		//devueleve el indice donde se encuentra por ultima vez el elemento indicado 
		System.out.println(lista.lastIndexOf("hola"));
		
		//elimina un elemento por el indice
		System.out.println(lista.remove(2));
		System.out.println(lista);
		
		
		System.out.println(lista.remove("ya vamonos"));
		System.out.println(lista);
		
		//Remplaza un elemento con otro en la posicion especificada
		lista.set(2, "un shot o que");
		System.out.println(lista);
		
		//Inserta un elemento en la pocicion especificada y desplaza el anterior
		lista.add(4, ":");
		System.out.println(lista);
		
		
		System.out.println(lista.subList(1, 4));
		
		
		
		
		
		
	}

}
