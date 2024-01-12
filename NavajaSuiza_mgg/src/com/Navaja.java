package com;

public class Navaja {

	//Atributos: color, numero de componentes incluidos, marca, dimensiones
	
	String color;
	int numeroDeComponentesIncluidos;
	String  marca;
	String dimensiones; 
	
	public Navaja () {
			
	}

	public Navaja(String color, int numeroDeComponentesIncluidos, String marca, String dimensiones) {
		super();
		this.color = color;
		this.numeroDeComponentesIncluidos = numeroDeComponentesIncluidos;
		this.marca = marca;
		this.dimensiones = dimensiones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroDeComponentesIncluidos() {
		return numeroDeComponentesIncluidos;
	}

	public void setNumeroDeComponentesIncluidos(int numeroDeComponentesIncluidos) {
		this.numeroDeComponentesIncluidos = numeroDeComponentesIncluidos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Navaja [color=" + color + ", numeroDeComponentesIncluidos=" + numeroDeComponentesIncluidos + ", marca="
				+ marca + ", dimensiones=" + dimensiones + "]";
	}

	
	}
	


