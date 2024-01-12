package comparacion;

import java.util.Scanner;

public class Dados {

	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingresa el resultado obtenido al lanzar el dado (1-6):");
	        int resultadoDado = scanner.nextInt();

	        String caraOpuesta = obtenerCaraOpuesta(resultadoDado);

	        if (caraOpuesta != null) {
	            System.out.println("La cara opuesta al resultado " + resultadoDado + " es: " + caraOpuesta);
	        } else {
	            System.out.println("ERROR: número incorrecto");
	        }

	        scanner.close();
	    }

	    public static String obtenerCaraOpuesta(int resultadoDado) {
	        if (resultadoDado >= 1 && resultadoDado <= 6) {
	            switch (resultadoDado) {
	                case 1:
	                    return "6";
	                case 2:
	                    return "5";
	                case 3:
	                    return "4";
	                case 4:
	                    return "3";
	                case 5:
	                    return "2";
	                case 6:
	                    return "1";
	            }
	        }
	        return null;
	    }
	}

