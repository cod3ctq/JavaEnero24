package com;

public class Tijeras {

	String tipo;
	String material;
	
	public Tijeras() {
		
	}

	public Tijeras(String tipo, String material) {
		
		this.tipo = tipo;
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Tijeras [tipo=" + tipo + ", material=" + material + "]";
	}
	
	
}
