package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ejercicio_jagh {

	
	public static void main(String[] args) {
			
		String linea = "";

	File file = new File("C:\\Users\\jg794\\OneDrive\\Escritorio\\jsafjsabgfjvnzmvdszl.txt");
	File file2 = new File("C:\\Users\\jg794\\OneDrive\\Escritorio\\jsafjsabgfjvnzmvdszl.txt");
    
	String[] dias = {"Primero","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho",
		    "Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete",
		    "Dieciocho","Diecinueve","Veinte","Veintiuno","Veintidos","Veintitres","Veinticuatro","Veinticinco","Veintiseis",
		    "Veintisiete","Veintiocho","Veintinueve","Treinta","Treinta y uno"};
	String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
	int dia = 0;
	int mes = 0;
	String resultado = "";
	
	
    try {
		FileReader fr = new FileReader (file); //Carga del contenido RAM
	    BufferedReader br = new BufferedReader(fr); //Lectura del cache
		FileWriter fw = new FileWriter(file2,true);
		
	    //Mientras la linea sea diferente de null...
	
	while((linea = br.readLine())!= null) {
//	System.out.println(linea);
		 //
		 dia = Integer.parseInt(linea.substring(0,2));
		 //
		 mes = Integer.parseInt(linea.substring(2,4));
		 
		 System.out.println(dias[dia-1] + "de"+ meses[mes-1] + "de" + linea.substring(4,8));
		 
	 resultado = dias[dia-1]+ "de"+ meses[mes-1] +
			 "de" +((String) linea).substring(4,linea.length());
	 
	 fw.write(resultado+"\n");
	 }//fin del while
	 fw.close(); //Guarda cambios
	
					
				
    }catch(Exception ex) {
    	ex.printStackTrace();
    
    }
								
}
	
}