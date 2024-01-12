package com;

public class Navaja {
	
	String tamaño;
	String material;
	boolean filo;
	
	
	public Navaja() {
		
	}

	public Navaja(String tamaño, String material, boolean filo) {
		this.tamaño = tamaño;
		this.material = material;
		this.filo = filo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isFilo() {
		return filo;
	}

	public void setFilo(boolean filo) {
		this.filo = filo;
	}

	@Override
	public String toString() {
		return "Navaja [tamaño=" + tamaño + ", material=" + material + ", filo=" + filo + "]";
	}
	
	
}
