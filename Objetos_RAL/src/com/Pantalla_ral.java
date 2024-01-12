package com;

public class Pantalla_ral {
	
	String panel;
	String resolucion;
	int frecuenciadeactualizacion;
	double tamaño;
	public Pantalla_ral(String panel, String resolucion, int frecuenciadeactualizacion, double tamaño) {
		this.panel = panel;
		this.resolucion = resolucion;
		this.frecuenciadeactualizacion = frecuenciadeactualizacion;
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
	public int getFrecuenciadeactualizacion() {
		return frecuenciadeactualizacion;
	}
	public void setFrecuenciadeactualizacion(int frecuenciadeactualizacion) {
		this.frecuenciadeactualizacion = frecuenciadeactualizacion;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Pantalla_ral [panel=" + panel + ", resolucion=" + resolucion + ", frecuenciadeactualizacion="
				+ frecuenciadeactualizacion + ", tamaño=" + tamaño + "]";
	}
	
	

}
