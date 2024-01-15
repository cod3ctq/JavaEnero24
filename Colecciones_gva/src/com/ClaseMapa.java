package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClaseMapa {
	public static void main(String[] args) {
		// add sth = put
		// extract sth = values(), contains(key), contains(value)
		// delete sth = clear, remove
		
		// ________________EJERCICIO DE MENU DE OPCIONES________________
		List<Contacto> ag1 = new ArrayList<Contacto>();// colecciones para
		// guardar datos
		Map<String, Contacto> ag2 = new HashMap<String, Contacto>();// tambien
		// para guardar datos
		Scanner sc = new Scanner(System.in);
		String nombre, direccion, numero, correo;
		Contacto con = null;
		
		int seleccion = 0;
		
		do {
			System.out.println("1 - Registrar contacto");
			System.out.println("2 - Buscar contacto");
			System.out.println("3 - Modificar contacto");
			System.out.println("4 - Eliminar contacto");
			System.out.println("5 - Buscar por numero");
			System.out.println("6 - Mostrar contactos");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 1: // Registro
				
				// La solucion pudo haber sido poner en cada caso un sc.nextLine(); 
				//Y asi en cada caso
				System.out.println("Introduce el nombre");
				nombre = sc.next();
				System.out.println("Introduce la direccion");
				direccion = sc.next();
				System.out.println("Introduce el numero");
				numero = sc.next();
				System.out.println("Introduce el correo");
				correo = sc.next();
				
				// Creacion de objeto:
				con = new Contacto(nombre, direccion, numero, correo);
				ag1.add(con); // agregar valores a la lista
				ag2.put(con.getNombre(), con); // agregar valores al mapa
				// Aqui esta la llave (el nombre), y al lado es todo el objeto
//				contacto
				
				
				// Reset del objeto
				con = null;
				break;
				
			case 2: // Buscador
				System.out.println("Ingresa el nombre");
				nombre = sc.next();
				
				//__________Busqueda en la lista__________
				
				for (int i = 0; i < ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						// busca en los indices de la lista, ahi se obtiene
						// el nombre y se iguala con la varaible nombre
						con = ag1.get(i);
						// de aqui saca la lista y la guarda en con
						break;
					}
				}
				
				if(con!=null) {
					System.out.println("Lista: " + con);// imprimir el ag1 imprime  la lista completa
				}
				
				//__________Busqueda en el mapa__________
				
				if(ag2.get(nombre)!=null) {
					System.out.println("Mapa: " + ag2.get(nombre));
				}
				// Reseteo del objeto
				con = null;
				break;
				
				
			case 3: // Modificador
				// ME LO REPITE EL PROCESO DE NUEVO
				
				System.out.println("Ingresa el contacto a editar");
				nombre = sc.next();
				
				//__________Busqueda en la lista__________
				for (int i = 0; i < ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						// echar un vistazo, buscar y preguntar nombre, igual a
						// para no sacarle copia y reintegrar, mejor esto:
						
						System.out.println("Ingresa la nueva direccion");
						direccion = sc.next();
						System.out.println("Ingresa el nuevo numero");
						numero = sc.next();
						System.out.println("Ingresa el nuevo correo");
						correo = sc.next();
						// Edicion de los valores del objeto
						ag1.get(i).setDireccion(direccion);
						ag1.get(i).setNumero(numero);
						ag1.get(i).setCorreo(correo);
						System.out.println("Lista: " + ag1);
						break;
					}
				}
				//__________Busqueda en el mapa__________
				if(ag2.get(nombre)!=null) {
					System.out.println("Mapa: " + ag2.get(nombre));
//					System.out.println("Ingresa la nueva direccion");
//					direccion = sc.next();
//					System.out.println("Ingresa el nuevo numero");
//					numero = sc.next();
//					System.out.println("Ingresa el nuevo correo");
//					correo = sc.next();
//					// Edicion de los valores del objeto
//					// la estructura no funciona con indices en esta ocasion
//					// funciona con llaves.
//					ag2.get(nombre).setDireccion(direccion);
//					ag2.get(nombre).setNumero(numero);
//					ag2.get(nombre).setCorreo(correo);
				}
				
				
				break;
				
				
				
			case 4: // Eliminador
				
				System.out.println("Ingresa el nombre");
				nombre = sc.next();
				
				int k = 0; //indice para eliminar
				//__________Busqueda en la lista__________
				
				for (int i = 0; i < ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						// Si trato de eliminar el elemento de la lista
						// desde aqui, cambio el size de la lista
						// ELIMINACION:
						k = i;
						break;
					}
				}
				// ELIMINACION DEL CONTACTO (para la lista)
				ag1.remove(k);
				
				// ELIMINACION DEL CONTACTO (para el mapa)
				ag2.remove(nombre);
				
				break;
				
				
				
			case 5: //Buscar por numero
				System.out.println("Ingresa el numero");
				numero = sc.next();
				
				//__________Busqueda en la lista__________
				
				for (int i = 0; i < ag1.size(); i++) {
					
					if (ag1.get(i).getNumero().equals(numero)) {
						con = ag1.get(i);
						break;
					}
				}
				
				if(con!=null) {
					System.out.println("Lista: " + con);
				}
				
				//__________Busqueda en el mapa__________
				// Como la llave es el nombre, hay que buscarlo con ese, 
				// no con el numero
				
				// Con el for-each, se lee de esta manera con la variable key
				// 
				// Entonces, por cada llave dentro del keyset (conjunto de llaves)
				//Por todos los que encuentres en el conjunto de las llaves
				for(String key:ag2.keySet()) {
					
					//La busqueda se basa en la llave, no el indice
					if(ag2.get(key).getNumero().equals(numero)) {
						// va cambiando la llave y va buscando un objeto diferente
						System.out.println("Mapa: " + ag2.get(key));
						break;
					}
				}
				
				
				// Reseteo del objeto
				con = null;
				break;
				
			case 6: // Mostrar Contactos
				
				// PARA LA LISTA
				System.out.println("Lista: " + ag1);
				
				//PARA EL MAPA
				for(String key:ag2.keySet()) {
					System.out.println("Mapa: "+ag2.get(key));
				}
				break;
				
				default:
					break;
			}
			
		}while (seleccion > 0 && seleccion < 7);
	}
	

}
