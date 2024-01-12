package com;

public class Desarmador {

	String material;
	String color;
	boolean deCuz;
	double tamaño;
	
	public Desarmador(String material, String color, boolean deCuz, double tamaño) {
		super();
		this.material = material;
		this.color = color;
		this.deCuz = deCuz;
		this.tamaño = tamaño;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isDeCuz() {
		return deCuz;
	}
	public void setDeCuz(boolean deCuz) {
		this.deCuz = deCuz;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Desarmador [material=" + material + ", color=" + color + ", deCuz=" + deCuz + ", tamaño=" + tamaño
				+ "]";
	}
	
	
}
