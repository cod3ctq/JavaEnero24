package com;

public class Libreta {
	
	String marca;
	String pasta;
	int contenido;
	String hoja;
	String espiral;
	
	//Constructores
	public Libreta () {
		
	}

	public Libreta(String marca, String pasta, int contenido, String hoja, String espiral) {
		super();
		this.marca = marca;
		this.pasta = pasta;
		this.contenido = contenido;
		this.hoja = hoja;
		this.espiral = espiral;
	}
	
	//Getter & Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public int getContenido() {
		return contenido;
	}

	public void setContenido(int contenido) {
		this.contenido = contenido;
	}

	public String getHoja() {
		return hoja;
	}

	public void setHoja(String hoja) {
		this.hoja = hoja;
	}

	public String getEspiral() {
		return espiral;
	}

	public void setEspiral(String espiral) {
		this.espiral = espiral;
	}

	@Override
	public String toString() {
		return "Libreta [marca=" + marca + ", pasta=" + pasta + ", contenido=" + contenido + ", hoja=" + hoja
				+ ", espiral=" + espiral + "]";
	}
	
	
	
	
	
	
	

}
