package com;

public class Pantalla {// como son muchos atributos, se hace una nueva clase
	
	String panel, resolucion;
	int frecuenciaActualizacion;
	double size;
	
	public Pantalla() {
		
	}
//______________________________________________________________________________________
	
	public Pantalla(String panel, String resolucion, int frecuenciaActualizacion, double size) {
		this.panel = panel;
		this.resolucion = resolucion;
		this.frecuenciaActualizacion = frecuenciaActualizacion;
		this.size = size;
		
		
		
	}
//______________________________________________________________________________________
	
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

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
//_______________________________________________________________
	@Override
	public String toString() {
		return "Pantalla [panel=" + panel + ", resolucion=" + resolucion + ", frecuenciaActualizacion="
				+ frecuenciaActualizacion + ", size=" + size + "]";
	}
	
	
	
	
	
	
}
