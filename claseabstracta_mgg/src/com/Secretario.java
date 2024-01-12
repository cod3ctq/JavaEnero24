package com;

public class Secretario extends Empleado implements Calidad, Contabilidad{

	
	
	//Comportamiento forma 2: Metodo heredado y sobreescrito
	@Override
	public void trabajar() {
		System.out.println("Atender llamadas, organizar docs, agendar citas");
	}
    
	//Comportamiento 3: Metodos Implementados
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
		
		
	}

	@Override
	public void generarDeclaraciones() {
		
		
	}

	@Override
	public void calcularNomina() {
		
		
	}
	
	
	

}
