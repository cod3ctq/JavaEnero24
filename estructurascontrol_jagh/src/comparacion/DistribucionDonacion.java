package comparacion;


	import java.util.Scanner;

	public class DistribucionDonacion {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el monto de la donación: ");
	        double montoDonacion = scanner.nextDouble();

	        double centroSalud;
	        double comedorNinos;
	        double inversionBolsa;

	        if (montoDonacion >= 10000) {
	            centroSalud = 0.3 * montoDonacion;
	            comedorNinos = 0.5 * montoDonacion;
	            inversionBolsa = 0.2 * montoDonacion;
	        } else {
	            centroSalud = 0.25 * montoDonacion;
	            comedorNinos = 0.6 * montoDonacion;
	            inversionBolsa = 0.15 * montoDonacion;
	        }

	        System.out.println("Distribución de la donación:");
	        System.out.println("Centro de Salud: $" + centroSalud);
	        System.out.println("Comedor de Niños: $" + comedorNinos);
	        System.out.println("Inversión en Bolsa: $" + inversionBolsa);

	        scanner.close();
	    }
	}

