package com;

public class Supervisor extends Empleado{

	@Override // versiones por logica que quedaron abstractos, y se agrega eso por default
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Dirigir, toma de decisiones, hacer reportes");
	}
	
	
}
