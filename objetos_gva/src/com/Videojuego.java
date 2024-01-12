package com;

public class Videojuego {
	
	// Atributos
	
	// Marca, formato (digital o fisico), plataforma, almacenamiento, categoria, year, clasificacion, tienda
	
	String marca;
	boolean digital;
	String plataforma;
	double almacenamiento;
	String categoria; 
	int year;
	String tienda;
	
	//________________Constructores________________
	// Click derecho + Source + Generate Constructor using fields
	public Videojuego() {
		
	}

	public Videojuego(String marca, boolean digital, String plataforma, double almacenamiento, String categoria,
			int year, String tienda) {
		this.marca = marca;
		this.digital = digital;
		this.plataforma = plataforma;
		this.almacenamiento = almacenamiento;
		this.categoria = categoria;
		this.year = year;
		this.tienda = tienda;
	}
	
	// ________________Getter & Setters________________
	// click derecho + Source + Generate Getters & Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(double almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	
	//________________toString________________
	// click derecho + source + Generate toString

	@Override
	public String toString() {
		return "Videojuego [marca = " + marca + ", digital = " + digital + ", plataforma = " + plataforma
				+ ", almacenamiento = " + almacenamiento + ", categoria = " + categoria + ", year = " + year + ", tienda = "
				+ tienda + "]";
	}
	
	//________________________________________________
	

	
	
	
	

}
