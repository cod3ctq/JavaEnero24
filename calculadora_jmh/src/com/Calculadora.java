package com;

public abstract class Calculadora {
	
	int sumar;
	int restar;
	int multiplicar;
	int dividir;
	
	public Calculadora () {
		
	}

	public Calculadora(int sumar, int restar, int multiplicar, int dividir) {
		super();
		this.sumar = sumar;
		this.restar = restar;
		this.multiplicar = multiplicar;
		this.dividir = dividir;
	}

	public int getSumar() {
		return sumar;
	}

	public void setSumar(int sumar) {
		this.sumar = sumar;
	}

	public int getRestar() {
		return restar;
	}

	public void setRestar(int restar) {
		this.restar = restar;
	}

	public int getMultiplicar() {
		return multiplicar;
	}

	public void setMultiplicar(int multiplicar) {
		this.multiplicar = multiplicar;
	}

	public int getDividir() {
		return dividir;
	}

	public void setDividir(int dividir) {
		this.dividir = dividir;
	}

	@Override
	public String toString() {
		return "Calculadora [sumar=" + sumar + ", restar=" + restar + ", multiplicar=" + multiplicar + ", dividir="
				+ dividir + "]";
	}
	
	//Metodo Abstracto 
		public abstract void operaciones ();

}
