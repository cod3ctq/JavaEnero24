package com;

public class Principal_H {
	public static void main(String [] args){
		
		//Metodos pueden retornar un valor o no
		Humano h1 = new Humano();
		//System.out.println(h1);
		
		Humano h2 = new Humano("juan",27,true,true,true);
		System.out.println(h2);

	h1.setEdad(26);
	h1.setNombre("Pedrito Sola");
	h1.setBronceado(true);
	System.out.println(h1);
	
}
}
