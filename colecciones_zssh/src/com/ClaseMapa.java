package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClaseMapa {
	
	public static void main(String[] args) {
		
		List<Contacto> ag1 = new ArrayList<Contacto>();
		Map<String, Contacto> ag2 = new HashMap<String, Contacto>();
		
		Scanner sc = new Scanner(System.in);
		String nombre, direccion, numero, correo;
		Contacto con = null;
		
		int seleccion=0,opc;
		 
		do {
			System.out.println("1- Registrar contacto");
			System.out.println("2- Buscar contacto");
			System.out.println("3- Modificar contacto");
			System.out.println("4- Eliminar contacto");
			System.out.println("5- Buscar contacto-->Numero");
			System.out.println("6- Mostrar contactos");
			System.out.println("Selecciona una opcion");
			seleccion = sc.nextInt();
			
			switch(seleccion) {
			case 1:
				sc.nextLine();
				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();
				System.out.println("Ingresa la direccion");
				direccion = sc.nextLine();
				System.out.println("Ingresa el numero");
				numero = sc.nextLine();
				System.out.println("Ingresa el correo");
				correo = sc.nextLine();
				
				//Creacion del objeto
				con = new Contacto(nombre, direccion, numero, correo);
				ag1.add(con);
				ag2.put(con.getNombre(), con);
				
				//Reset del objeto
				con = null;
				
				break;
			case 2:
				sc.nextLine();
				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();
				
				//Busqueda en la lista
				for (int i = 0; i< ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						con= ag1.get(i);
						break;
					}
				}
				if (con!=null) {
					System.out.println("Lista "+con);
				}
				
				//Busqueda en mapa
				if (ag2.get(nombre)!=null) {
					System.out.println("Mapa: "+ag2.get(nombre));
				}
				
				con = null;
				break;
			case 3:
				sc.nextLine();
				System.out.println("Ingresa el contacto a editar/modificar");
				nombre = sc.nextLine();
				
				//Busqueda en la lista

				for (int i = 0; i< ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre) && ag2.get(nombre)!=null) {
						con= ag1.get(i);
						
						sc.nextLine();
						System.out.println("Ingresa la nueva direccion");
						direccion = sc.nextLine();
						System.out.println("Ingresa el nuevo numero");
						numero = sc.nextLine();
						System.out.println("Ingresa el nuevo correo");
						correo = sc.nextLine();
						//Edicion
						ag1.get(i).setDireccion(direccion);
						ag1.get(i).setNumero(numero);
						ag1.get(i).setCorreo(correo);
						//Edicion mapa
						ag2.get(nombre).setDireccion(direccion);
						ag2.get(nombre).setNumero(numero);
						ag2.get(nombre).setCorreo(correo);
						
						con = null;
						break;
					}
				}
				//Modificar en mapa
//				if (ag2.get(nombre)!=null) {
//					sc.nextLine();
//					System.out.println("Ingresa la nueva direccion");
//					direccion = sc.nextLine();
//					System.out.println("Ingresa el nuevo numero");
//					numero = sc.nextLine();
//					System.out.println("Ingresa el nuevo correo");
//					correo = sc.nextLine();
//					//Edicion
//					ag2.get(nombre).setDireccion(direccion);
//					ag2.get(nombre).setNumero(numero);
//					ag2.get(nombre).setCorreo(correo);
//				}
				con = null;
				break;
			case 4:
				sc.nextLine();
				System.out.println("Ingresa el nombre");
				nombre = sc.nextLine();
				int k=0;
				//Busqueda en la lista
				for (int i = 0; i< ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						
						k=i;
						break;
					}
				}
				//Elimino al contacto -->Lista
				ag1.remove(k);
				//Eliminar en mapa
				ag2.remove(nombre);
				
				break;
			case 5:
				sc.nextLine();
				System.out.println("Ingresa el numero");
				numero = sc.nextLine();
				
				//Busqueda en la lista
				for (int i = 0; i< ag1.size(); i++) {
					if(ag1.get(i).getNumero().equals(numero)) {
						con= ag1.get(i);
						break;
					}
				}
				if (con!=null) {
					System.out.println("Lista "+con);
				}
				
				//Busqueda en mapa
				//Por cada llave: dentro de(conjunto de llaves del mapa)
				for(String key:ag2.keySet()) {
					if(ag2.get(key).getNumero().equals(numero)) {
						System.out.println("Mapa: "+ag2.get(key));
						break;
					}
				}
				
				con = null;
				break;
			case 6:
				
					System.out.println("Lista "+ag1);
				
				//Busqueda en mapa
				for(String key:ag2.keySet()) {
					System.out.println("Mapa: "+ag2.get(key));
				}
					
				
				con = null;
				break;
				
			
			}
			
		}while(seleccion>0 && seleccion < 7);
		
		
	}
	

}
