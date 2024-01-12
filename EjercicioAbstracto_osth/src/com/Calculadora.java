package com;

public abstract class Calculadora {

	String marca;
	String color;
	String tamaño;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String tamaño) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	
	public abstract void calcular();
	
}
