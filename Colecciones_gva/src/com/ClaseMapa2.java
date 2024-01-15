package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClaseMapa2 {
	public static void main(String[] args) {
		
	
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
		System.out.println("6 - Mostrar contacto");
		seleccion = sc.nextInt();
		
		switch (seleccion) {
		case 1: // Registro
			System.out.println("Introduce el nombre");
			nombre = sc.next();
			System.out.println("Introduce la direccion");
			direccion = sc.next();
			System.out.println("Introduce el numero");
			numero = sc.next();
			System.out.println("Introduce el correo");
			correo = sc.next();
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		
		default:
			System.out.println("Introduzca opcion valida");
		}
		
		
		
	}while(seleccion > 0 && seleccion < 7);
	
	}
}
