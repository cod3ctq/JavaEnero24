package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class principal {

	public static void main(String[] args) {
		
		String linea = "";
		
//		Representacion del archivo dentro del codigo
		File file = new File("C:\\Users\\jg794\\OneDrive\\Escritorio\\jsafjsabgfjvnzmvdszl.txt");
		File file2 = new File("C:\\Users\\jg794\\OneDrive\\Escritorio\\escritura.txt");
		
		
		try {
//			FileReader fr = new FileReader (file); //Carga del contenido RAM
//			BufferedReader br = new BufferedReader(fr); //Lectura del cache
//			Mientras la linea sea diferente de null...
//			while((linea = br.readLine())!= null) {
//				System.out.println(linea);
//			}	
		
			
			// true: mantiene lo que ya no estaba en el archivo
			// false: sobreescribe el contenido del archivo
		FileWriter fw = new FileWriter(file2,false);
		String abc = "ABCDEFGHIJKL";
		for (int i = 0; i < abc.length(); i++) {
			fw.write(abc.charAt(i));
		}
		
		fw.close(); //Guarda los cambios en el archivo
		
		
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Fallo el codigo");
		
		}
		
	
		
		
		
		
	}
}
