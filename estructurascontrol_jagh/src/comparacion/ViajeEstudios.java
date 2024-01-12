package comparacion;

import java.util.Scanner;

public class ViajeEstudios {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de alumnos:");
	        int cantidadAlumnos = scanner.nextInt();

	        double costoAlumno = calcularCostoAlumno(cantidadAlumnos);
	        double costoTotalCompania = calcularCostoTotalCompania(cantidadAlumnos);

	        System.out.println("El costo por alumno es: " + costoAlumno + " euros.");
	        System.out.println("El pago total a la compañía de autobuses es: " + costoTotalCompania + " euros.");

	        scanner.close();
	    }

	    public static double calcularCostoAlumno(int cantidadAlumnos) {
	        if (cantidadAlumnos >= 100) {
	            return 65;
	        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
	            return 70;
	        } else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
	            return 95;
	        } else {
	            return 4000.0 / cantidadAlumnos;
	        }
	    }

	    public static double calcularCostoTotalCompania(int cantidadAlumnos) {
	        return cantidadAlumnos * calcularCostoAlumno(cantidadAlumnos);
	    }
	}

