package comparacion;

import java.util.Scanner;

public class PrecioUva {


		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingresa el precio inicial por kilo de uva:");
	        double precioInicial = scanner.nextDouble();

	        System.out.println("Ingresa el tipo de uva (A/B):");
	        char tipoUva = scanner.next().charAt(0);

	        System.out.println("Ingresa el tamaño de la uva (1/2):");
	        int tamanoUva = scanner.nextInt();

	        double precioFinal = calcularPrecioFinal(precioInicial, tipoUva, tamanoUva);
	        System.out.println("El productor recibirá " + precioFinal + " céntimos por kilo de uva.");

	        scanner.close();
	    }

	    public static double calcularPrecioFinal(double precioInicial, char tipoUva, int tamanoUva) {
	        if (tipoUva == 'A') {
	            if (tamanoUva == 1) {
	                return precioInicial + 20;
	            } else if (tamanoUva == 2) {
	                return precioInicial + 30;
	            }
	        } else if (tipoUva == 'B') {
	            if (tamanoUva == 1) {
	                return precioInicial - 30;
	            } else if (tamanoUva == 2) {
	                return precioInicial - 50;
	            }
	        }

	        // Si no es A ni B, o el tamaño no es 1 ni 2, retorna el precio inicial
	        return precioInicial;
	    }
	}

