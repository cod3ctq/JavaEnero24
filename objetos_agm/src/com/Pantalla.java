package com;

public class Pantalla {

	String panel;
	String resolucion;
	int frecuenciaActualizacion;
	double tamaño;
	
	public Pantalla() {
		
	}
	//constructores
	//click derecho, source, generate constructor fields

	public Pantalla(String panel, String resolucion, int frecuenciaActualizacion, double tamaño) {
		super();
		this.panel = panel;
		this.resolucion = resolucion;
		this.frecuenciaActualizacion = frecuenciaActualizacion;
		this.tamaño = tamaño;
	}
	//getter & setters 
		//click derecho,source, generate  getters and setters

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
//toString// click derecho, source,generate to string
	@Override
	public String toString() {
		return "Pantalla [panel=" + panel + ", resolucion=" + resolucion + ", frecuenciaActualizacion="
				+ frecuenciaActualizacion + ", tamaño=" + tamaño + "]";
	}
	
	
	
	
}
