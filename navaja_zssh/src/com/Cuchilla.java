package com;

public class Cuchilla {

//	Tijeras tijeras;
//	Destornillador destor;
	
	String filo;
	String material;
	int cantidad;
	
	public Cuchilla() {
		
	}

	public Cuchilla(String filo, String material, int cantidad) {
		
		this.filo = filo;
		this.material = material;
		this.cantidad = cantidad;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuchilla [filo=" + filo + ", material=" + material + ", cantidad=" + cantidad + "]";
	}
	
	
}
