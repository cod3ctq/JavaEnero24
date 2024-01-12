package com;

public class sacaCorchos extends Navaja{

	String material;
	String color;
	boolean funciona;
	String piezas;
	
	public sacaCorchos(String material, String color, boolean funciona, String piezas) {
		super();
		this.material = material;
		this.color = color;
		this.funciona = funciona;
		this.piezas = piezas;
	}
	public sacaCorchos() {
		// TODO Auto-generated constructor stub
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
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public String getPiezas() {
		return piezas;
	}
	public void setPiezas(String piezas) {
		this.piezas = piezas;
	}
	@Override
	public String toString() {
		return "sacaCorchos [material=" + material + ", color=" + color + ", funciona=" + funciona + ", piezas="
				+ piezas + "]";
	}
	
	
}
