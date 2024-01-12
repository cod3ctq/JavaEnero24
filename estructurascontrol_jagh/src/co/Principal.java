package co;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[]args) {
		//while, do-while, for

        Scanner sc = new Scanner(System.in);
		int x = 60;
		System.out.println("igresa un numero");
		int n = sc.nextInt();
		
		
//		while(x>10) { //primero evalua la condicion
//		     System.out.println("interacion"+x+"-"+(x+n));
//		     x-=2;
//		}
//		
		
//		do {
//			System.out.println("Interacion:"+x+"-"+(x+n));
//			x--;
//			
//		}while(x>10);
		
		for (int k = 0; k <= 50; k=k+2) {
			System.out.println(n+"*"+k+"="+(n*k));
			
//			if((n*k)%2==0) {
//				System.out.println((n*k)+"es par");
//			}
			
			
		}
			
		}
	
		
		
		}
		
		
