package com;

public class Secretario extends Empleado implements Calidad,Contabilidad{
	
	// Comportamiento forma 2 : Metodo heredado y sobreescrito
	@Override
	public void trabajar() {
		System.out.println("Atender llamadas, organizar docs,agendar citas");		
	}

	//Comportamiento forma 3 :  Metodos implementados
	@Override
	public void evaluarProducto() {
		
	}

	@Override
	public void auditar() {
		
	}

	@Override
	public void medir() {
		
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
