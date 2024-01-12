package com;

public class Procesador {
	
	String fabricante;
	int nucleos;
	double frecuencia;
	
	public Procesador() {
	}
	
	//____________________________________________________________________

	public Procesador(String fabricante, int nucleos, double frecuencia) {
		this.fabricante = fabricante;
		this.nucleos = nucleos;
		this.frecuencia = frecuencia;
	}
	
	//____________________________________________________________________

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	//____________________________________________________________________
	
	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", nucleos=" + nucleos + ", frecuencia=" + frecuencia + "]";
	}
	
	
	
}
