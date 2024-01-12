package com;

public class Desarmador {

	String tipodesarmador;
	double tamaño;
	double grosor;
	
	public Desarmador () {
		
	}

	public Desarmador(String tipodesarmador, double tamaño, double grosor) {
		this.tipodesarmador = tipodesarmador;
		this.tamaño = tamaño;
		this.grosor = grosor;
	}

	public String getTipodesarmador() {
		return tipodesarmador;
	}

	public void setTipodesarmador(String tipodesarmador) {
		this.tipodesarmador = tipodesarmador;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public double getGrosor() {
		return grosor;
	}

	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}

	@Override
	public String toString() {
		return "Desarmador [tipodesarmador=" + tipodesarmador + ", tamaño=" + tamaño + ", grosor=" + grosor + "]";
	}
	

	
	
}
