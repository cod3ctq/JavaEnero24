package com;

public class abreLatas {

	String material;
	String color;
	double tamaño;
	
	public abreLatas(String material, String color, double tamaño) {
		super();
		this.material = material;
		this.color = color;
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
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "abreLatas [material=" + material + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	
	
}
