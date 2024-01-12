package com;

public class ClasePrueba {
	
	
	private int atributoA;
	protected String atributoB;
	public double valorC;
	
	public ClasePrueba(){
		
	}
	
	public ClasePrueba(int atributoA, String atributoB, double valorC) {
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.valorC = valorC;
	}

	public int getAtributoA() {
		return atributoA;
	}

	public void setAtributoA(int atributoA) {
		this.atributoA = atributoA;
	}

	public String getAtributoB() {
		return atributoB;
	}

	public void setAtributoB(String atributoB) {
		this.atributoB = atributoB;
	}

	public double getValorC() {
		return valorC;
	}

	public void setValorC(double valorC) {
		this.valorC = valorC;
	}
	
	
	
	
	

}
