package com;

public class calcular extends Calculadora implements CalculadoraBasica,CalculadoraCientifica{

	void calcular(){
		System.out.println("sumar,restar,dividir,multiplicar,convertir,fraccionar,derivar");
		
		
	}

	@Override
	public String toString() {
		return "calcular [color=" + color + ", tamaño=" + tamaño + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void fracciones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void derivadas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void conversiones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sumar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		
	}
 }
