package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClaseMapa {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			List<Contacto>ag1 = new ArrayList<Contacto>();
			Map<String, Contacto> ag2= new HashMap<String, Contacto>();
			String nombre;
			String direccion;
			String numero;
			String correo;
			Contacto con = null;
			
			
			int seleccion=0;
			int fin = 0;
			do {
				System.out.println("\n");
				System.out.println("1.- Registrar contacto");
				System.out.println("2.- Buscar contacto");
				System.out.println("3.- Modificar Contacto");
				System.out.println("4.- Eliminar contacto");
				System.out.println("5.- Buscar Numero");
				System.out.println("6.- Mostrar contactos");
				System.out.println("Selecciona una opcion");
				seleccion = sc.nextInt();
			
			
			switch(seleccion) {
			
			case 1:
				System.out.println("ingresa el nombre");
				nombre = sc.next();
				System.out.println("ingresa la direccion");
				direccion = sc.next();
				System.out.println("ingresa el numero");
				numero = sc.next();
				System.out.println("ingresa el correo");
				correo = sc.next();
				
				
				//Creacion del objeto
				con= new Contacto(nombre, direccion, numero ,correo);
				
				ag1.add(con);
				ag2.put(con.getNombre(),con);
				
				//reset del objeto
				con=null;
				break;
				
			case 2:
				System.out.println("ingresa el nombre a buscar");
				nombre = sc.next();
				System.out.println("\n");
				//Bussqueda en la lista
				//indexOf
				for(int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						con=ag1.get(i);
						System.out.println(con);
						break;
					}
				}
				
				
				if(con!=null) {
					System.out.println("Lista: "+con);
				}
				
				//Busqueda en el mapa
				//
				
				if(ag2.get(nombre)!=null) {
					System.out.println("Mapa: "+ag2.get(nombre));
					System.out.println("\n");
				}
				con=null;
				break;
				
			case 3:
				System.out.println("ingresa el nombre a editar");
				nombre = sc.next();
				
				//Bussqueda en la lista
				//indexOf
				for(int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						//con=ag1.get(i);
						
						System.out.println("ingresa la nueva direccion");
						direccion = sc.nextLine();
						System.out.println("ingresa el nuevo numero");
						numero = sc.nextLine();
						System.out.println("ingresa el nuevo correo");
						correo = sc.nextLine();
						
						ag1.get(i).setDireccion(direccion);
						ag1.get(i).setNumero(numero);
						ag1.get(i).setCorreo(correo);
						
						break;
					}
				}
				
				if(ag2.get(nombre)!=null) {
					System.out.println("ingresa la nueva direccion");
					direccion = sc.nextLine();
					System.out.println("ingresa el nuevo numero");
					numero = sc.nextLine();
					System.out.println("ingresa el nuevo correo");
					correo = sc.nextLine();
					//edicion
					ag2.get(nombre).setDireccion(direccion);
					ag2.get(nombre).setNumero(numero);
					ag2.get(nombre).setCorreo(correo);
				}
				
				break;
				
			case 4:
				System.out.println("ingresa el nombre a buscar");
				nombre = sc.next();
				
				//Bussqueda en la lista
				//indexOf
				int k=0;
				for(int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						//elimonaciion
						k=i;
						
						break;
					}
				}
				
				//Eliminar el contacto (lista)
				ag1.remove(k);
				//Eliminar contacor en el mapa
				ag2.remove(nombre);
				
				break;
				
				
			case 5:
				//Buscar numero
				System.out.println("ingresa el numero a buscar");
				numero = sc.next();
				
				//Bussqueda en la lista
				//indexOf
				for(int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNumero().equals(numero)) {
						con=ag1.get(i);
						break;
					}
				}
				
				
				if(con!=null) {
					System.out.println("Lista: "+con);
				}
				
				//Busqueda en el mapa
				//
				
				//por cada llave dentro del conjunto de llaves del mapa
				for(String key: ag2.keySet()) {
					
					if(ag2.get(key).getNumero().equals(numero)) {
					System.out.println("Mapa: "+ag2.get(key));
					break;
					}
				}
				con=null;
				break;
				
				
			case 6:
				for(int i=0; i<ag1.size();i++) {
					
						con=ag1.get(i);
						if(con!=null) {
							System.out.println("\n"+"Lista: "+ag1);
						}
						if(ag2!=null) {
							System.out.println("\n"+"Mapa: "+ag2 +"\n");
						}
						con=null;
						
						break;
					
				}
				break;
				
			case 7:
				
				System.out.println("Hasta luego");
				fin=1;
				break;
				
				default:
					System.out.println("\n Opcion no reconocida, Intente de nuevo");
			}
		
		
		//agregar - put
		//extraer - values(), contains(key), contains(value)
		//borrar - clear, remove,

			}while(fin!=1);
		
		
	}

}
