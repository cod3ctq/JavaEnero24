package com;

public class Destornillador {

	String punta;
	int cantidad;
	
	public Destornillador() {
		
	}

	public Destornillador(String punta, int cantidad) {
		
		this.punta = punta;
		this.cantidad = cantidad;
	}

	public String getPunta() {
		return punta;
	}

	public void setPunta(String punta) {
		this.punta = punta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Destornillador [punta=" + punta + ", cantidad=" + cantidad + "]";
	}
	
}
