package comparacion;


	import java.util.Scanner;

	public class CalculoCostoTransporte {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el peso del paquete en kilogramos: ");
	        double pesoPaquete = scanner.nextDouble();

	        if (pesoPaquete <= 5) {
	            System.out.print("Ingrese la zona de destino (1-5): ");
	            int zonaDestino = scanner.nextInt();

	            double costoTotal = calcularCosto(pesoPaquete, zonaDestino);

	            if (costoTotal > 0) {
	                System.out.println("El costo total de la entrega es: " + costoTotal + " euros.");
	            } else {
	                System.out.println("Error: Zona de destino no válida.");
	            }
	        } else {
	            System.out.println("El paquete no puede ser transportado debido a su peso superior a 5 kg.");
	        }
	    }

	    static double calcularCosto(double peso, int zona) {
	        switch (zona) {
	            case 1:
	                return peso * 24.0;
	            case 2:
	                return peso * 20.0;
	            case 3:
	                return peso * 21.0;
	            case 4:
	                return peso * 10.0;
	            case 5:
	                return peso * 18.0;
	            default:
	                return -1; // Zona no válida
	        }
	    }
	}

