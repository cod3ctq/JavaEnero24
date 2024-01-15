package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClaseMapa {

	
	
	public static <Numero> void main(String[] args) {
		
		
		List<Contacto> ag1=new ArrayList<Contacto>();
		Map<String,Contacto> ag2=new HashMap<String,Contacto>();
	
		Scanner sc= new Scanner(System.in);
		
		String nombre;
		String direccion;
		String numero;
		String correo;
	    
		Contacto con= null;
		
	
		int seleccion=0;
		do {
			System.out.println("1 - Registrar contacto");
			System.out.println("2 - Buscar contacto");
			System.out.println("3 - Modificar contacto");
			System.out.println("4 - Eliminar contacto");
			System.out.println("5 - Buscar por numero");		
			System.out.println("6 - Mostrar contactos");
			System.out.println("Selecciona una opcion");
			seleccion=sc.nextInt();
			
			switch(seleccion){
			case 1:
				sc.nextLine();
				System.out.println("Ingresa el nombre");
				nombre= sc.nextLine();
				System.out.println("Ingresa la direccion");
				direccion = sc.nextLine();
				System.out.println("Ingresa el numero");
				numero= sc.nextLine();
				System.out.println("Ingresa el correo");
				correo= sc.nextLine();
				
				//Creacion del objeto
				con = new Contacto(nombre,direccion,numero,correo);
				ag1.add(con);//añades con lista
				ag2.put(con.getNombre(),con);//añades con mapa
				
				//Reset del objeto
				con=null;
				
				break;
				
			case 2:
				sc.nextLine();
				System.out.println("Ingresa el nombre a buscar");
				nombre= sc.nextLine();
				
				//busqueda en la lista
				for (int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNombre().equals(nombre)){
						con= ag1.get(i);
						break;
						
					}
				}
				if(con!=null) {
					System.out.println("Lista: "+con);
					
				}
				
				//busqueda en el mapa
				
				if(ag2.get(nombre)!=null) {
					System.out.println("Mapa: "+ag2.get(nombre));
					
				}
				con=null;
				break;
			
			case 3:
				sc.nextLine();
				System.out.println("Ingresa el contacto a editar");
				nombre= sc.nextLine();
				
				//primero lo buscamos en la lista
				for (int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNombre().equals(nombre)){
						
						//lo que se va a modificar
						System.out.println("Ingresa la nueva direccion");
						direccion = sc.nextLine();
						System.out.println("Ingresa el nuevo numero");
						numero= sc.nextLine();
						System.out.println("Ingresa el nuevo correo");
						correo= sc.nextLine();
						
						
						//son las que se encontraron modificadas
						ag1.get(i).setDireccion(direccion);
						ag1.get(i).setNumero(numero);
						ag1.get(i).setCorreo(correo);
						
						
						break;
						
					}
				}
				
				
				//modificacion en el mapa
				
				if(ag2.get(nombre)!=null) {
					
					
					System.out.println("Ingresa la nueva direccion");
					direccion = sc.nextLine();
					System.out.println("Ingresa el nuevo numero");
					numero= sc.nextLine();
					System.out.println("Ingresa el nuevo correo");
					correo= sc.nextLine();
					
					
					//son las que se encontraron modificadas
					ag2.get(nombre).setDireccion(direccion);//se ingresa el nombre
					ag2.get(nombre).setNumero(numero);
					ag2.get(nombre).setCorreo(correo);
					
		
				}
				break;
				
			case 4://eliminar el contacto en el mapa
				sc.nextLine();
				System.out.println("Ingresa el nombre a buscar");
				nombre= sc.nextLine();
				
				
				int k=0;
				
				//busqueda en la lista
				for (int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNombre().equals(nombre)){
						//eliminacion
						k=i;
						break;
						
					}
				}
				//elimino al contacto(lista)
				ag1.remove(k);
				//elimina en el mapa
				ag2.remove(nombre);
			
			break;
			
			
			
			
			case 5: //muestra un contacto
				sc.nextLine();
				
				System.out.println("Ingresa el numero del contacto a buscar");
				numero= sc.nextLine();
				//busqueda en la lista
				for (int i=0; i<ag1.size();i++) {
					if(ag1.get(i).getNumero().equals(numero)){
						//muestra un contacto
						con= ag1.get(i);
						break;
					}
				}
				if(con!=null) {
					System.out.println("Lista: "+con);
					
				}
				
				//busqueda en el mapa
				Collection<Contacto> values = ag2.values();
				for (Contacto value : values) {
					if (value.getNumero().equals(numero) == true) {
						System.out.println(value);
					}
				    //System.out.println(value.getNumero().equals(numero));
				}
				
				
				con = null;
				break;
				
			case 6:
				
				sc.nextLine();
				
				System.out.println(ag1);
				
				for(String key:ag2.keySet()) {
					System.out.println(ag2.get(key));
				}
				break;
				
				default:

			}
			
		}while(seleccion>0 && seleccion <7);
		
		}
		
	}

	
