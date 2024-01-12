package comparacion;



	import java.util.Scanner;

	public class DiasDelMes {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Ingresa un número entero entre 1 y 12: ");
	            int numeroMes = scanner.nextInt();

	            if (numeroMes >= 1 && numeroMes <= 12) {
	                int diasDelMes = obtenerDiasDelMes(numeroMes);
	                System.out.println("El mes " + numeroMes + " tiene " + diasDelMes + " días.");
	            } else {
	                System.out.println("Por favor, ingresa un número válido entre 1 y 12.");
	            }
	        } catch (Exception e) {
	            System.out.println("Por favor, ingresa un número entero válido.");
	        } finally {
	            scanner.close();
	        }
	    }

	    private static int obtenerDiasDelMes(int mes) {
	        if (mes == 2) {
	            return 28;
	        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	            return 30;
	        } else {
	            return 31;
	        }
	    }
	}

