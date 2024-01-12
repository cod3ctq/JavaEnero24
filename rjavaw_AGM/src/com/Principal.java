package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		
		
		String linea ="";//lectura
		
		//representacion del archivo dentro del codigo
		File file=new File("C:\\Users\\HP\\Documents\\lectura.txt");//objeto: ruta del archivo, ruta de acceso arriba
		File file2= new File("C:\\Users\\HP\\Documents\\escritura.txt");//este se crea para escribir en el archivo, se le cambia el nombre y se hace uno nuevo con el nombreque quieras 
		try {
			
//			FileReader fr=new FileReader(file);//carga del contenido en RAM
//		BufferedReader br=new BufferedReader((fr));//lectura del cache
		
			
			//mientras la linea sea diferente de null
//		while((linea =br.readLine())!= null){//lee las lineas a menos que no haya nada
//			System.out.println(linea);
			
		//}
		
			FileWriter fw=new FileWriter(file2,false);//true es para añadir mas palabras y false es para reemplazar en el archivo
			String abc ="3e45678";//lo que vas a escribir en la hoja
			
			
			for (int i=0; i<abc.length(); i++) {
				fw.write(abc.charAt(i));
				//se puede escribir pero las letras que estan ABCDEFGHJK y el metodo charAt lo separa
			}
			
			fw.close();//se guardan los cambios en el archivo
			
		}catch(Exception ex) {
			ex.printStackTrace();//imprime el error
			System.out.println("Error en el codigo");
		}
		
		
	}
}
