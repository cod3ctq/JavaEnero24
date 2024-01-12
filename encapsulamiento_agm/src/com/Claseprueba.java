package com;

public class Claseprueba {
	
// son 3 modificadores de acceso:
	
	private int atributoA;
	protected String atributoB;
	public double valorC;
	
	
	
	
	public Claseprueba() {
		
	}
	
	//using Fields
public Claseprueba(int atributoA, String atributoB, double valorC) {
		super();
		this.atributoA = atributoA;
		this.atributoB = atributoB;
		this.valorC = valorC;
	}


//getters y setters
	
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
