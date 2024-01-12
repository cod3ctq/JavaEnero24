package com;

//modelo plantilla
//Clase= QUE Y COMO
public class Celular_ral {

	//atributos
	//marca,parlante,durabilidad,color, compañia,bateria
	//modelo, 
	
	String marca;
	String color;
	boolean liberado;
	double mAh;
	String modelo;
	double peso;
	
	//constructores
	//instancia un objeto con los valores default de lo stipos de datos
	public Celular_ral() {
		
	}
//este metodo crea un objeto con calores reales desde el inicio
	public Celular_ral(String marca, String color, boolean liberado, double mAh, String modelo, double peso) {
		this.marca = marca;
		this.color = color;
		this.liberado = liberado;
		this.mAh = mAh;
		this.modelo = modelo;
		this.peso = peso;
	}
//Getters & Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isLiberado() {
		return liberado;
	}

	public void setLiberado(boolean liberado) {
		this.liberado = liberado;
	}

	public double getmAh() {
		return mAh;
	}

	public void setmAh(double mAh) {
		this.mAh = mAh;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	//toString
	
	@Override
	public String toString() {
		return "Celular_ral [marca=" + marca + ", color=" + color + ", liberado=" + liberado + ", mAh=" + mAh
				+ ", modelo=" + modelo + ", peso=" + peso + "]";
	}
	
	//-------Comportamiento
	//1--- Metodos nativos
	//2----Metodos heredados (comunmente sobreescritos)
	//3----Metodos implementados (traidos de una interface)
	//(interface es in contrato de acciones)
	
	
}
