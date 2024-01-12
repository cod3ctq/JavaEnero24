package com;
//Modelo, plantilla
//que y como
public class Celular {
// cuando no tiene (main) ayuda como referencia
	//solo un metodo main para todo el proyecto
	
	//Atributos
	//marca,parlante,durabilidad,compañia,bateria
	//modelo,peso
	
	//identificar cada variable conforme a datos primitivos
	
	String marca;
//	boolean parlante; //si o no por eso se usa boolean
//	double durabilidad; //si dura menos de cada año
	String color;
	boolean liberado; //si o no el celular puede reconocer otros chip
	double mAh; //mili ampers
	String modelo;
	double peso;
	
	public Celular () { // sino se pone no entra en las demas
	}	
	
	
	//constructores 
	//instancia un objeto con los valores default 
	//de los tipos de datos
	
	
//este metodo crea un objeto con valores reales desde el inicio 
	//click derecho, source, generate constructor fields
	public Celular(String marca, String color, boolean liberado, double mAh, String modelo, double peso) {
		super();
		this.marca = marca;
		this.color = color;
		this.liberado = liberado;
		this.mAh = mAh;
		this.modelo = modelo;
		this.peso = peso;
	}
//getter & setters 
	//click derecho,source, generate  getters and setters
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

	
	
	
	
	
	//toString// click derecho, source,generate to string
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", liberado=" + liberado + ", mAh=" + mAh + ", modelo="
				+ modelo + ", peso=" + peso + "]";
	}
	
	
	//---COMPORTAMIENTO
    //Metodos nativos (son de la misma categoria eso quiere decir que los metodos se crearon en el mismo formato)
	//Metodos heredados (comunmente se sobreescriben)
	//Metodos implementados (traidos de una interface)(un contrato de acciones)lo que comunica A con B
}
