package com;

public abstract class Calculadora {
	
	String color;
	String tamaño;
	int numBotones;
	
	public Calculadora() {
		
	}

public Calculadora(String color, String tamaño, int numBotones) {
		super();
		this.color = color;
		this.tamaño = tamaño;
		this.numBotones = numBotones;
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

public int getNumBotones() {
	return numBotones;
}

public void setNumBotones(int numBotones) {
	this.numBotones = numBotones;
}


@Override
public String toString() {
	return "Calculadora [color=" + color + ", tamaño=" + tamaño + ", numBotones=" + numBotones + "]";
}

	//Metodo abstracto calcular
	public abstract void calcular();
	
	
	
}
