package com;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio_RAL {
public static void main(String[] args) {
		 
String linea = "";
			
//representacion del archivo dentro del codigo
File file= new File("C:\\Users\\4PF42LA_1909\\Desktop\\texto.txt");
File file2= new File("C:\\Users\\4PF42LA_1909\\Desktop\\escritura.txt");
			
String[] dias = {
		            "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
		            "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", 
		            "Diecinueve", "Veinte", "Veintiuno", "Veintidós", "Veintitrés", "Veinticuatro", 
		            "Veinticinco", "Veintiséis", "Veintisiete", "Veintiocho", "Veintinueve", "Treinta", "Treinta y uno"
		        };

String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	int dia = 0;
	int mes = 0;
	String resultado = ""; //Variable tipo string se inicializa en " " o null
	
			try {
				FileReader fr = new FileReader(file);	//Carga del contenido en RAM
				BufferedReader br = new BufferedReader(fr); //Lectura del cache
				FileWriter fw = new FileWriter(file2, true); 
				
					// mientras la linea sea diferente de null...
				while((linea= br.readLine()) != null) {
					//System.out.println(linea);
					
				
					dia = Integer.parseInt(linea.substring(0, 2)); //convierte variable srting a int
					mes = Integer.parseInt(linea.substring(2, 4));
					
					System.out.println( dias[dia-1] +" de "+ meses[mes-1] +
							" de "+ linea.substring(4, linea.length()));
					
				resultado= dias[dia-1] +" de "+ meses[mes-1] +
						" de "+ linea.substring(4, linea.length());
				fw.write(resultado + "\n");
				}
				fw.close(); //guarda los cambios
			}catch(Exception ex) {
				
			}
					
		 
		 
		 
		 
	 }
}
