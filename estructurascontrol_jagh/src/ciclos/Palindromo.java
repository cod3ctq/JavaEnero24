package ciclos;



	import java.util.Scanner;

	public class Palindromo {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una palabra: ");
	        String palabra = scanner.nextLine();

	        if (esPalindromo(palabra)) {
	            System.out.println("La palabra es un palíndromo.");
	        } else {
	            System.out.println("La palabra no es un palíndromo.");
	        }
	    }

	    private static boolean esPalindromo(String str) {
	        str = str.replaceAll("\\s+", "").toLowerCase();
	        int longitud = str.length();

	        for (int i = 0; i < longitud / 2; i++) {
	            if (str.charAt(i) != str.charAt(longitud - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

