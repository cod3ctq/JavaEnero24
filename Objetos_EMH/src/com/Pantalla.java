package com;

public class Pantalla {
	
	String panel;
	String resolucion;
	int frecuenciaActualizacion;
	double tamaño;
	
	public Pantalla() {
		
	}
	
	
	public Pantalla(String panel, String resolucion, int frecuenciaActualizacion, double tamaño) {
		this.panel = panel;
		this.resolucion = resolucion;
		this.frecuenciaActualizacion = frecuenciaActualizacion;
		this.tamaño = tamaño;
	}


	public String getPanel() {
		return panel;
	}


	public void setPanel(String panel) {
		this.panel = panel;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	public int getFrecuenciaActualizacion() {
		return frecuenciaActualizacion;
	}


	public void setFrecuenciaActualizacion(int frecuenciaActualizacion) {
		this.frecuenciaActualizacion = frecuenciaActualizacion;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	@Override
	public String toString() {
		return "Pantalla [panel=" + panel + ", resolucion=" + resolucion + ", frecuenciaActualizacion="
				+ frecuenciaActualizacion + ", tamaño=" + tamaño + "]";
	}
	
	
	
	
	

}
