//Realiza un programa que pida un número por teclado y nos indique si es par o impar.

package cm;

import java.util.Scanner;

public class Par_Impar2 {

	public static void main (String[] args) {
		int numero;
		
	

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un numero entero: ");
		numero = sc.nextInt();
		 
		if (numero % 2 == 0 )// %2 identifica si es par 
		{
			System.out.println("Par");
		}
		else 
		{
		System.out.println("Impar");
}
}
}
