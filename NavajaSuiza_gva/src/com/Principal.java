package com;

public class Principal {
	public static void main(String[] args) {
	
		
//		NavajaSuiza NS1 = new NavajaSuiza("Victorinox", "Roja", 1500.00, 300.00, 10);
		
		FuncionCortar Blades = new FuncionCortar(true, true, false);
		FuncionAbrir Openers = new FuncionAbrir(true, false, true);
		FuncionBTools BTools = new FuncionBTools(true, true, true);
		FuncionCTools CTools = new FuncionCTools(false, true, true, true, true);
		
		Funciones NVS1Func = new Funciones("Victorinox", "Red", 2000, 100, 10, Blades, Openers, BTools, CTools);

		
		System.out.println(NVS1Func);
		
	}

}
