package com;

public class Cuenta {
	
	
	String numCuenta;
	double saldoDisponible;
	double max;
	double min;
	
	public Cuenta() {
		
	}

	public Cuenta(String numCuenta, double saldoDisponible, double max, double min) {
		super();
		this.numCuenta = numCuenta;
		this.saldoDisponible = saldoDisponible;
		this.max = max;
		this.min = min;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
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
		return "Cuenta [numCuenta=" + numCuenta + ", saldoDisponible=" + saldoDisponible + ", max=" + max + ", min="
				+ min + "]";
	}
	

}
