package com;

public class NavajaSuiza {
	// marca, color, precio, numero de funciones
	String marca, color; 
	double precio, peso;
	int numfunciones;
	
	public NavajaSuiza() {
		
	}

	public NavajaSuiza(String marca, String color, double precio, double peso, int numfunciones) {
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.numfunciones = numfunciones;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNumfunciones() {
		return numfunciones;
	}

	public void setNumfunciones(int numfunciones) {
		this.numfunciones = numfunciones;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [marca=" + marca + ", color=" + color + ", precio=" + precio + ", peso=" + peso
				+ ", numfunciones=" + numfunciones + "]";
	}
	
	
	
	
	
	
	
	
	

}
