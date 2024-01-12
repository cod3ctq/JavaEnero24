package com;

public class Principal {
	public static void main(String [] args){

	
		
		Desarmador_ral ds1= new Desarmador_ral(true,false);
		Herramientas t1= new Herramientas(true, true, 2);
		
		Navajasuiza_ral ns1 = new Navajasuiza_ral ("Acero de Damasco", true, 15.3, ds1, t1);
		System.out.println(ns1);
		
		
		
	}
}
