package com;
//Clase padre
public class Filero_ral {

	
	String meterial;
	boolean filodeamboslados;
	double largo;
	
public Filero_ral() {
		
	}

public Filero_ral(String meterial, boolean filodeamboslados, double largo) {
	super();
	this.meterial = meterial;
	this.filodeamboslados = filodeamboslados;
	this.largo = largo;
}

public String getMeterial() {
	return meterial;
}

public void setMeterial(String meterial) {
	this.meterial = meterial;
}

public boolean isFilodeamboslados() {
	return filodeamboslados;
}

public void setFilodeamboslados(boolean filodeamboslados) {
	this.filodeamboslados = filodeamboslados;
}

public double getLargo() {
	return largo;
}

public void setLargo(double largo) {
	this.largo = largo;
}

@Override
public String toString() {
	return "Filero_ral [meterial=" + meterial + ", filodeamboslados=" + filodeamboslados + ", largo=" + largo + "]";
}

}
