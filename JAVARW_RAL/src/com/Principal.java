package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	 public static void main(String[] args) {
	 
	//flujo entre archivos de escritura y codigo
	//modificar o escribir en archivos desde codigo
		
		String linea = "";
		
		//representacion del archivo dentro del codigo
		File file= new File("C:\\Users\\4PF42LA_1909\\Desktop\\texto.txt");
		File file2= new File("C:\\Users\\4PF42LA_1909\\Desktop\\escritura.txt");
	
		try {
//			FileReader fr = new FileReader(file);	//Carga del contenido en RAM
//			BufferedReader br = new BufferedReader(fr); //Lectura del cache
				// mientras la linea sea diferente de null...
//			while((linea= br.readLine()) != null) {
//				System.out.println(linea);
//			}
			//true guarda lo que ya esta y agrega lo nuevo
			//false sobre escibe el archivo
			FileWriter fw = new FileWriter(file2, true); 
			String abc = "ABCDEFGHIJKL";
			for (int i=0; i<abc.length(); i++) {
				fw.write(abc.charAt(i));
			}
		
			fw.close();//guarda los cambios en el archivo
			
	 	} catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("valiste queso");
		}
		
		
		 
	 }
}
