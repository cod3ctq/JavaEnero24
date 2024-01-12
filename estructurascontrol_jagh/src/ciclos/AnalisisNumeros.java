package ciclos;

	import java.util.Scanner;

	public class AnalisisNumeros {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Inicializar variables
	        int sumatoriaPositivos = 0;
	        int sumatoriaImpares = 0;

	        // Solicitar al usuario ingresar 20 números
	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Ingrese el número " + i + ": ");
	            int numero = scanner.nextInt();

	            // Verificar si el número es positivo o negativo
	            if (numero > 0) {
	                System.out.println("Número positivo");
	                sumatoriaPositivos += numero;
	            } else if (numero < 0) {
	                System.out.println("Número negativo");
	            } else {
	                System.out.println("El número es cero");
	            }

	            // Verificar si el número es par o impar
	            if (numero % 2 == 0) {
	                System.out.println("Número par\n");
	            } else {
	                System.out.println("Número impar\n");
	                sumatoriaImpares += numero;
	            }
	        }

	        // Mostrar sumatoria de positivos y sumatoria de impares
	        System.out.println("Sumatoria de números positivos: " + sumatoriaPositivos);
	        System.out.println("Sumatoria de números impares: " + sumatoriaImpares);

	        scanner.close();
	    }
	}

