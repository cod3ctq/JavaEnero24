package comparacion;


	import java.util.Scanner;

	public class DiaSemana {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el día de la semana (1 al 7): ");
	        int numeroDia = scanner.nextInt();

	        String nombreDia = obtenerNombreDia(numeroDia);

	        if (nombreDia != null) {
	            System.out.println("El día correspondiente es: " + nombreDia);
	        } else {
	            System.out.println("Error: Número de día no válido.");
	        }
	    }

	    public static String obtenerNombreDia(int numeroDia) {
	        switch (numeroDia) {
	            case 1:
	                return "Lunes";
	            case 2:
	                return "Martes";
	            case 3:
	                return "Miércoles";
	            case 4:
	                return "Jueves";
	            case 5:
	                return "Viernes";
	            case 6:
	                return "Sábado";
	            case 7:
	                return "Domingo";
	            default:
	                return null;
	        }
	    }
	}

