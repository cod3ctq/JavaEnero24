package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClaseMapa {
	

	public static void main(String[] args) {
		//agregar - put
		//extraer - values(), contains(key), contains(value)
		//borrar - clear, remove,
		
		List<Contacto> ag1 =new ArrayList<Contacto>();
		Map<String, Contacto> ag2 = new HashMap<String, Contacto>();
		Scanner sc = new Scanner(System.in);
		String nombre, direccion = null, numero = null, correo = null;
		Contacto  con = null;
		
		int seleccion = 0;
		
		do {
			System.out.println("1 - Registrar contacto");
			System.out.println("2 - Buscar contacto");
			System.out.println("3 - Modificar contacto");
			System.out.println("4 - Eliminar contacto");
			System.out.println("5 - Buscar por numero");
			System.out.println("6 - Mostrar contactos");
			System.out.println("Selecciona una opcion");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			
			case 1:
				sc.nextLine();
				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();
				System.out.println("Ingresa la direccion");
				nombre = sc.nextLine();
				System.out.println("Ingresa el numero");
				nombre = sc.nextLine();
				System.out.println("Ingresa el correo");
				nombre = sc.nextLine();
				
				//Creacion del objeto
				con = new Contacto(nombre, direccion, numero, correo);
				ag1.add(con);
				ag2.put(con.getNombre(), con);
				
				//Reset del objeto
				con = null;
			
			break;
			case 2:
				sc.nextLine();
				System.out.println("Ingresa el nombre a buscar");
				nombre = sc.nextLine();
				
				
				
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
				if(ag1.get(i).getNombre().equals(nombre)) {
				con = ag1.get(i);
				break;
				
				}
				}
				if (con!=null) {
					System.out.println("Lista: "+con);
					
				}
				
				//Busqueda en mapa		
				if(ag2.get(nombre)!=null) {
					System.out.println("Mapa: "+ag2.get(nombre));
				}
				con = null;
				break;
			case 3:
				sc.nextLine();
				System.out.println("Ingresa el contacto a editar");
				nombre = sc.nextLine();
				
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
				if(ag1.get(i).getNombre().equals(nombre)) {
				
					System.out.println("Ingresa la nueva direccion");
					nombre = sc.nextLine();
					System.out.println("Ingresa el nuevo numero");
					nombre = sc.nextLine();
					System.out.println("Ingresa el nuevo correo");
					nombre = sc.nextLine();
					//Edicion
	               ag1.get(i).setDireccion(direccion);
				   ag1.get(i).setNombre(numero);
				   ag1.get(i).setCorreo(correo);
				break;
				
				}
			}
				if(ag2.get(nombre)!=null) {
					
					System.out.println("Ingresa la nueva direccion");
					nombre = sc.nextLine();
					System.out.println("Ingresa el nuevo numero");
					nombre = sc.nextLine();
					System.out.println("Ingresa el nuevo correo");
					nombre = sc.nextLine();
	               ag2.get(nombre).setDireccion(direccion);
				   ag2.get(nombre).setNombre(numero);
				   ag2.get(nombre).setCorreo(correo);
				
				   break;
				}	
			case 4:
				sc.nextLine();
				System.out.println("Ingresa el nombre a eliminar");
				nombre = sc.nextLine();
				int k = 0;
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
				if(ag1.get(i).getNombre().equals(nombre)) {
					//eliminacion
					k = i;
					break;
				
				}
				}
				//Elimino al contanto
				ag1.remove(k);
				
				//Elimina en el mapa
				ag2.remove(nombre);
				
				
				break;
			case 5:
				sc.nextLine();
				System.out.println("Ingresa el numero a buscar");
				numero = sc.nextLine();
				
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
				if(ag1.get(i).getNumero().equals(numero)) {
				con = ag1.get(i);
			    break;
				
				}
				}
				con = null;
				break;
				
				
			case 6:
				
				System.out.println(ag1);
				for(String key:ag2.keySet()) {
					System.out.println(ag2.get(key));
				}
				
				
				
				
		
				break;
			
				
				
					}
				
		}while(seleccion>0 && seleccion < 7);
		}
		}
