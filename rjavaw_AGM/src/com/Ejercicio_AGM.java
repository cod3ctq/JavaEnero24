package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio_AGM {

	public static void main(String[] args) {

		String linea = " ";

		File file = new File("C:\\Users\\HP\\Documents\\lectura.txt");
		File file2 = new File("C:\\Users\\HP\\Documents\\escritura.txt");// este se crea para escribir en el archivo, se
																			// le cambia el nombre y se hace uno nuevo
																			// con el nombreque quieras

		String[] dias = { "Primero", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once",
				"Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte",
				"Veintiuno", "Veintidos", "Veintitres", "Veinticuatro", "Veinticinco", "Veintiseis", "Veintisiete",
				"Veintiocho", "Veintinueve", "Treinta", "Treinta y uno" };

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		int dia = 0;
		int mes = 0;
		String resultado = "";

		try {
			FileReader fr = new FileReader(file);// carga del contenido en RAM
			BufferedReader br = new BufferedReader((fr));// lectura del cache (revisar que se importe)

			FileWriter fw = new FileWriter(file2);

			while ((linea = br.readLine()) != null) {// lee las lineas a menos que no haya nada
				// System.out.println(linea);

				dia = Integer.parseInt(linea.substring(0, 2));// se utiliza para divir
				mes = Integer.parseInt(linea.substring(2, 4));

				System.out.println(dias[dia - 1] + "de" + meses[mes - 1] + linea.substring(4, linea.length()));
				/*dia-1 es para
																												 que
																												 la
																												 posicion
																												 que
																												 se
																												 quiere
																												 si se
																												 empiece
																												 desde
																												 el
																												 numero
																												 1 y
																												 no
																												 desde
																												 el
																												 cero*/

				resultado = dias[dia - 1] + "de " + meses[mes - 1] + "de " + linea.substring(4, linea.length());
				fw.write(resultado + "\n");// se aplica un salto de linea
				

			}
			fw.close();/* guardar los cambios */

		} catch (Exception ex) {
			ex.printStackTrace();// imprime el error
			System.out.println("Error en el codigo");
		}

	}

}
