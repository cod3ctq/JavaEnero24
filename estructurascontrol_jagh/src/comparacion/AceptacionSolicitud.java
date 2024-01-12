package comparacion;

import java.util.Scanner;

public class AceptacionSolicitud {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingresa la nota:");
	        int nota = scanner.nextInt();

	        System.out.println("Ingresa la edad:");
	        int edad = scanner.nextInt();

	        System.out.println("Ingresa el sexo (M/F):");
	        char sexo = scanner.next().charAt(0);

	        if (nota >= 5 && edad >= 18) {
	            if (sexo == 'M') {
	                System.out.println("POSIBLE");
	            } else if (sexo == 'F') {
	                System.out.println("ACEPTADA");
	            } else {
	                System.out.println("NO ACEPTADA");
	            }
	        } else {
	            System.out.println("NO ACEPTADA");
	        }

	        scanner.close();
	    }
	}
