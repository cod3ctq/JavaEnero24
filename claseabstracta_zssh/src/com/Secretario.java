package com;

public class Secretario extends Empleado implements Calidad,Contabilidad{

	
	//Comportamiento forma 2: Metodo heredado y sobreescrito
	@Override
	public void trabajar() {
		System.out.println("Atender llamadas, organizar docs, agendar citas");
		
	}

	//Comportamiento forma 3 : Metodos implementados
	//Traidos de la interface
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
