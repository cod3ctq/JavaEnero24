package com;

public class Cuenta {
 String numcuenta;
 double saldodisponible;
 double max;
 double min;
 
 public Cuenta () {
	 
 }
public Cuenta(String numcuenta, double saldodisponible, double max, double min) {
	super();
	this.numcuenta = numcuenta;
	this.saldodisponible = saldodisponible;
	this.max = max;
	this.min = min;
}
public String getNumcuenta() {
	return numcuenta;
}
public void setNumcuenta(String numcuenta) {
	this.numcuenta = numcuenta;
}
public double getSaldodisponible() {
	return saldodisponible;
}
public void setSaldodisponible(double saldodisponible) {
	this.saldodisponible = saldodisponible;
}
public double getMax() {
	return max;
}
public void setMax(double max) {
	this.max = max;
}
public double getMin() {
	return min;
}
public void setMin(double min) {
	this.min = min;
}
@Override
public String toString() {
	return "Cuenta [numcuenta=" + numcuenta + ", saldodisponible=" + saldodisponible + ", max=" + max + ", min=" + min
			+ "]";
}


	
	
}
