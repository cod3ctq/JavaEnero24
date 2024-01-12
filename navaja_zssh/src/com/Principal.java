package com;

public class Principal {
	public static void main(String[] args) {

		Cuchilla c = new Cuchilla();
		Destornillador d = new Destornillador("Cruz", 2);
		Tijeras t = new Tijeras("Punta", "Acero");
		Cuchilla c1 = new Cuchilla("1f", "Acero", 1);
		NavajaSuiza n = new NavajaSuiza("1", "Acero", 3, t, d, c1, "Rojo", "M", 300.00);
		System.out.println(n);
		
		
		
	}
}
