package com;

public abstract class Calculadora {
	
	double numeros;
	String operadores;
	String CaracteresEspeciales;
	
	
	public Calculadora() {
		
	}


	public Calculadora(double numeros, String operadores, String caracteresEspeciales) {
		this.numeros = numeros;
		this.operadores = operadores;
		CaracteresEspeciales = caracteresEspeciales;
	}


	public double getNumeros() {
		return numeros;
	}


	public void setNumeros(double numeros) {
		this.numeros = numeros;
	}


	public String getOperadores() {
		return operadores;
	}


	public void setOperadores(String operadores) {
		this.operadores = operadores;
	}


	public String getCaracteresEspeciales() {
		return CaracteresEspeciales;
	}


	public void setCaracteresEspeciales(String caracteresEspeciales) {
		CaracteresEspeciales = caracteresEspeciales;
	}


	@Override
	public String toString() {
		return "Calculadora [numeros=" + numeros + ", operadores=" + operadores + ", CaracteresEspeciales="
				+ CaracteresEspeciales + "]";
	}
	
	
	public abstract void Calcular();
	

}
