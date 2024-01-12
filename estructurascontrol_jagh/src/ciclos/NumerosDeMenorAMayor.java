package ciclos;


	import java.util.Scanner;

	public class NumerosDeMenorAMayor {

	    public static void main(String[] args) {
	        // Crear un objeto Scanner para la entrada de usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario ingresar dos números
	        System.out.print("Ingrese el primer número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int numero2 = scanner.nextInt();

	        // Determinar el menor y el mayor
	        int menor = Math.min(numero1, numero2);
	        int mayor = Math.max(numero1, numero2);

	        // Mostrar los números desde el menor hasta el mayor
	        System.out.println("Números desde el menor hasta el mayor:");
	        for (int i = menor; i <= mayor; i++) {
	            System.out.println(i);
	        }

	        // Cerrar el objeto Scanner
	        scanner.close();
	    }
	}


