package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
		int seleccion = 0;
		
		do {
			System.out.println("1 Registrar contacto");
			System.out.println("2 Buscar contacto");
			System.out.println("3 Modificar contacto");
			System.out.println("4 Eliminar contacto");
			System.out.println("5 buscar por numero");
			System.out.println("6 Mostrar contactos");
			System.out.println("Seleccione una opcion");
			seleccion=sc.nextInt();
				
		switch(seleccion) {
		
		case 1:
			System.out.println("Ingresa el nombre");
			nombre= sc.next();
			System.out.println("Ingresa la direccion");
			direccion= sc.next();
			System.out.println("Ingresa el numero");
			numero= sc.next();
			System.out.println("Ingresa el correo");
			correo= sc.next();
			
			//Creacion del objeto
			con = new Contacto(nombre, direccion, numero, correo);
		
			ag1.add(con);
			ag2.put(con.getNombre(), con);
				
			//Reset del objeto
			con = null;
			break;
		case 2:
			System.out.println("Ingresa el nombre abuscar");
			nombre= sc.nextLine();
			
			//busqueda en la lista
			
			 for(int i =0; i< ag1.size(); i++) {
				 if(ag1.get(i).getNombre().equals(nombre)) {
					 con= ag1.get(i);
					 break;
				 }
				 
			 }
			if (con != null) {
				System.out.println("Lista: "+con);
			}
			
			//busqueda en el mapa
			
			if (ag2.get(nombre)!= null) {
				System.out.println("Mapa: "+ag2.get(nombre));
			}
			
			con = null;
		break; 
		
		case 3:
			System.out.println("Ingresa el contacto a editar");
			nombre= sc.nextLine();
			
			//busqueda en la lista
			
			 for(int i =0; i< ag1.size(); i++) {
				 if(ag1.get(i).getNombre().equals(nombre)) {
					
					System.out.println("Ingresa la direccion");
					direccion= sc.nextLine();
					System.out.println("Ingresa el numero");
					numero= sc.nextLine();
					System.out.println("Ingresa el correo");
					correo= sc.nextLine();
					//Edicion
					ag1.get(i).setDireccion(direccion);
					ag1.get(i).setNumero(numero);
					ag1.get(i).setCorreo(correo);
					
					 break;
				 } 
			 }
			 
			 if(ag2.get(nombre)!= null) {	
					System.out.println("Ingresa la direccion");
					direccion= sc.nextLine();
					System.out.println("Ingresa el numero");
					numero= sc.nextLine();
					System.out.println("Ingresa el correo");
					correo= sc.nextLine();
					//Edicion
					ag2.get(nombre).setDireccion(direccion);
					ag2.get(nombre).setNumero(numero);
					ag2.get(nombre).setCorreo(correo);
			 
			 }
			 
			break;
			
		case 4:
			System.out.println("Ingresa el contacto a eliminar");
			nombre= sc.nextLine();
			
			int k = 0;
			//busqueda en la lista
			 for(int i =0; i< ag1.size(); i++) {
				 if(ag1.get(i).getNombre().equals(nombre)) {
					 //eliminacion
					 k=i;
					 break;
				 } 
			 }
			
			//Elimino al contacto (lista)
			 ag1.remove(k);
			//Elimino al contacto (MAPA)
			ag2.remove(nombre); 
			break;
			
		case 5:
			System.out.println("Ingresa el numero a buscar");
			numero= sc.next();
			
			//busqueda en la lista
			
			 for(int i =0; i< ag1.size(); i++) {
				 if(ag1.get(i).getNumero().equals(numero)) {
					 con= ag1.get(i);
					 break;
				 } 
			 }
			 
				if (con != null) {
					System.out.println("Lista: "+con);
				}
				
				//busqueda en el mapa
				// por cada llave dentro del conjunto de llaves del mapa
				for(String key:ag2.keySet()) {
					if(ag2.get(key).getNumero().equals(numero)) {
						System.out.println("Mapa: "+ ag2.get(key));
						break;
					}	
				}
			con=null;
			break;
		case 6:
			//lista
			System.out.println(ag1);
			//mapa
//			System.out.println(ag2.values());
			for(String key:ag2.keySet()) {
			System.out.println(ag2.get(key));
			}
			break;

		}
		}
		while (seleccion>0 && seleccion<7);{
			
		}
	}
}
	


