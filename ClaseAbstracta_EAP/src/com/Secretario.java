package com;

public class Secretario extends Empleado implements Calidad,Contabilidad{

	
	public void trabajar() {
		
		//Comportamiento forma 2 : Método heredado y sobreescrito
		System.out.println("Atender llamadas, organizar docs, agendar citas");
		
		
		
	}
	
	//Comportamiento de la forma 3 : metodos implementados
	@Override
	public void evaluarProducto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void auditar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void medir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void administrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generarDeclaraciones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularNomina() {
		// TODO Auto-generated method stub
		
	}
	
}
