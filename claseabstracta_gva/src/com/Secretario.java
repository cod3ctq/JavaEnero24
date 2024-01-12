package com;
// Ahora si simulamos multiherencia, al agregar interfaces agregando comportamientos sin agregar
// atributos
public class Secretario extends Empleado implements Calidad, Contabilidad{
	
	
	
	// Comportamiento forma 2: un metodo heredado y sobreescrito
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub		
		System.out.println("Atender llamadas, organizar docs, agendar citas");
	}
	// clases hijas de una clase abstracta deben de resolver n metodos de la clase abstracta


	
	// Comportamiento forma 3: Metodos Implementados
	//__________________________________Interface Calidad__________________________________
	@Override
	public void evaluarProducto() {
		// TODO Auto-generated method stub // Puedo borrar esto si quiero
		System.out.println();
	}

	@Override
	public void auditar() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void medir() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	//__________________________________Interface Contabilidad__________________________________
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
