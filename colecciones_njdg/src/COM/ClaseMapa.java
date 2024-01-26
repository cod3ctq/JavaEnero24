package COM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClaseMapa {
	
	public static void main (String[] args) {
		
		List<Contacto> ag1 = new ArrayList<Contacto>();
		Map<String, Contacto> ag2 = new HashMap<String,Contacto>();
		
		
		Scanner sc = new Scanner(System.in);
		String nombre = null;
		String direccion;
		String numero = null;
		String correo;
		
		Contacto con = null;
		int seleccion = 0;
		
		do {
			System.out.println("1.- Registrar contacto");
			System.out.println("2.- Buscar contacto");
			System.out.println("3.- Modificar contacto");
			System.out.println("4.- Eliminar contacto");
			System.out.println("5.- Buscar por numero");
			System.out.println("6.- Mostrar contactos");
			System.out.println("SELECCIONA UNA OPCION:");
			seleccion = sc.nextInt();
			
			switch (seleccion) {
			case 1:
				//sc.nextLine();
				System.out.println("Ingresa el nombre");
				nombre = sc.next();
				System.out.println("Ingresa la direccion");
				direccion = sc.next();
				System.out.println("Ingresa el numero");
				numero = sc.next();
				System.out.println("Ingresa el correo");
				correo = sc.next();
				
				//Creacion del objeto
				con = new Contacto(nombre, direccion, numero, correo);
				
				ag1.add(con);
				ag2.put(con.getNombre(), con);
				
				//reset del objeto
				con = null;
				
				break;
			case 2:
				
				System.out.println("Ingresa el nombrea buscar");
				nombre = sc.nextLine();
				
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						con = ag1.get(i);
						break;
					}
				}
				if (con != null) {
					System.out.println("Lista: "+con);
				}

				
				//Busqueda en mapa
				if (ag2.get(nombre)!=null) {
					System.out.println("Mapa: "+ag2.get(nombre));
				}
				con = null;
				break;
			case 3:
				System.out.println("Ingresa el contacot a editar");
				nombre = sc.next();
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						
						
						
						System.out.println("Ingresa la nueva direccion");
						direccion = sc.next();
						System.out.println("Ingresa el nuevo numero");
						numero = sc.next();
						System.out.println("Ingresa el nuevo correo");
						correo = sc.next();
						
						ag1.get(i).setDireccion(direccion);
						ag1.get(i).setNumero(numero);
						ag1.get(i).setCorreo(correo);
						
						
						break;
					}
				}
				
				
				if (ag2.get(nombre)!=null) {
					System.out.println("Ingresa la nueva direccion");
					direccion = sc.next();
					System.out.println("Ingresa el nuevo numero");
					numero = sc.next();
					System.out.println("Ingresa el nuevo correo");
					correo = sc.nextLine();
					
					ag2.get(nombre).setDireccion(direccion);
					ag2.get(nombre).setNumero(numero);
					ag2.get(nombre).setCorreo(correo);
				}
				
				
				break;
			case 4:
				
				System.out.println("Ingresa el nombrea buscar");
				nombre = sc.next();
				
				int k = 0;
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(nombre)) {
						//Eliminacion, aqui solo altera el tamaño de la lista
						k=i;
						
						break;
					}
				}
				//Elimino al contacto
				ag1.remove(k);
				
				//Elimina en le mapa
				ag2.remove(nombre);
				
				
				break;
				
			case 5:
				System.out.println("Ingresa el numero a buscar");
				numero = sc.next();
				
				//Busqueda en la lista
				for (int i = 0; i < ag1.size(); i++) {
					if(ag1.get(i).getNombre().equals(numero)) {
						con = ag1.get(i);
						break;
					}
				}
				if (con != null) {
					System.out.println("Lista: "+con);
				}

				
				//Busqueda en mapa
//				for(String key:ag2.keySet());{
//					if(ag2.get(numero).equals(numero));
//					System.out.println("mapa: ");
//				}
				
				
				Collection<Contacto> values = ag2.values();
				for (Contacto value : values) {
					if (value.getNumero().equals(numero) == true) {
					
					System.out.println(value);
					}
				    //System.out.println(value.getNumero().equals(numero));
				}
				con = null;
				
				//mapa
				//por cada llave dentro de
				
				break;
			case 6:
System.out.println("La lista completa es :\n"+ag1.toString()+"\n");
				
				Collection<Contacto> values2 = ag2.values();
				for (Contacto value : values2) {
						System.out.println(value);
				    //System.out.println(value.getNumero().equals(numero));
				}
				
				break;
				
				default:

			}
			
			
		}while(seleccion > 0 && seleccion <7);


	}
}

		
	


