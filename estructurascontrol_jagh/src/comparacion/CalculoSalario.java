package comparacion;


	import java.util.Scanner;

	public class CalculoSalario {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese las horas trabajadas:");
	        int horasTrabajadas = scanner.nextInt();

	        int salario = calcularSalario(horasTrabajadas);
	        System.out.println("El salario semanal es: $" + salario);

	        scanner.close();
	    }

	    public static int calcularSalario(int horasTrabajadas) {
	        int salarioBase = 16;
	        int horasNormales = 40;
	        int salarioExtra = 20;

	        if (horasTrabajadas <= horasNormales) {
	            return horasTrabajadas * salarioBase;
	        } else {
	            int salarioTotal = horasNormales * salarioBase;
	            int horasExtras = horasTrabajadas - horasNormales;
	            salarioTotal += horasExtras * salarioExtra;
	            return salarioTotal;
	        }
	    }
	}

