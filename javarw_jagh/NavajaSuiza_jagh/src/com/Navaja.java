package com;

public class Navaja {
	

	String marca;
	String color;
	String modelo;
	boolean mangoDePlastico;
	double peso;
	String piezas;
	
	public Navaja() {
		
	}

	public Navaja(String marca, String color, String modelo, boolean mangoDePlastico, double peso, String piezas) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.mangoDePlastico = mangoDePlastico;
		this.peso = peso;
		this.piezas = piezas;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isMangoDePlastico() {
		return mangoDePlastico;
	}

	public void setMangoDePlastico(boolean mangoDePlastico) {
		this.mangoDePlastico = mangoDePlastico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPiezas() {
		return piezas;
	}

	public void setPiezas(String piezas) {
		this.piezas = piezas;
	}

	@Override
	public String toString() {
		return "Navaja [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", mangoDePlastico="
				+ mangoDePlastico + ", peso=" + peso + ", piezas=" + piezas + "]";
	}
	
}
