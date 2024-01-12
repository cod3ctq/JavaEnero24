package ciclos;


	import java.util.Scanner;

	public class Algoritmo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el número para la tabla de multiplicar: ");
	        int numero = scanner.nextInt();

	        System.out.print("Ingrese la iteración deseada: ");
	        int iteracionDeseada = scanner.nextInt();

	        System.out.println("Tabla de multiplicar del " + numero + " hasta la iteración " + iteracionDeseada + ":");

	        for (int i = 1; i <= iteracionDeseada; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	    }
	}

