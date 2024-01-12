package com;

public class Pantalla {
	
	String panel;
	String resolucion;
	int frecuanciaActualizacion;
	double tamaño;



public Pantalla() {
	
}


public Pantalla(String panel, String resolucion, int frecuanciaActualizacion, double tamaño) {
	super();
	this.panel = panel;
	this.resolucion = resolucion;
	this.frecuanciaActualizacion = frecuanciaActualizacion;
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


public int getFrecuanciaActualizacion() {
	return frecuanciaActualizacion;
}


public void setFrecuanciaActualizacion(int frecuanciaActualizacion) {
	this.frecuanciaActualizacion = frecuanciaActualizacion;
}


public double getTamaño() {
	return tamaño;
}


public void setTamaño(double tamaño) {
	this.tamaño = tamaño;
}


@Override
public String toString() {
	return "Pantalla [panel=" + panel + ", resolucion=" + resolucion + ", frecuanciaActualizacion="
			+ frecuanciaActualizacion + ", tamaño=" + tamaño + "]";
}
	

}