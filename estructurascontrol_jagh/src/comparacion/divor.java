package comparacion;

import java.util.Scanner;

public class divor {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa el primer número:");
    double numero1 = scanner.nextDouble();

    System.out.println("Ingresa el segundo número:");
    double numero2 = scanner.nextDouble();

    if (numero2 != 0) {
        double resultado = numero1 / numero2;
        System.out.println("El resultado de la división es: " + resultado);
    } else {
        System.out.println("Error: No es posible dividir por cero.");
    }

    scanner.close();
}
}