package com;

public class Cuenta {
	
	String numcuenta;
	double saldoDisp, max, min;
	
	public Cuenta() {
	}

	public Cuenta(String numcuenta, double saldoDisp, double max, double min) {
		super();
		this.numcuenta = numcuenta;
		this.saldoDisp = saldoDisp;
		this.max = max;
		this.min = min;
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	public double getSaldoDisp() {
		return saldoDisp;
	}

	public void setSaldoDisp(double saldoDisp) {
		this.saldoDisp = saldoDisp;
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
		return "Cuenta [numcuenta=" + numcuenta + ", saldoDisp=" + saldoDisp + ", max=" + max + ", min=" + min + "]";
	}
	
	
}
