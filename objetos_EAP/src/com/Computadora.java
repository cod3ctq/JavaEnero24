package com;

public class Computadora {
	

	//Atributos
	//marca, parlante, durabilidad, color, compañía, batería,modelo, peso
	
	String marca;
	String color;
	int RAM;
	boolean laptop;
	String modelo;
	double peso;
	String Resolucon;
	boolean wifi;
	int puertosUSB;
	double almacenamiento;
	
	//Constructores
		//Instancia un objeto con los valores default de los tipos de datos
		public Computadora() {
			
			
		}
//Constructor con argumentos
	public Computadora(String marca, String color, int rAM, boolean laptop, String modelo, double peso,
			String resolucon, boolean wifi, int puertosUSB, double almacenamiento) {
		super();
		this.marca = marca;
		this.color = color;
		RAM = rAM;
		this.laptop = laptop;
		this.modelo = modelo;
		this.peso = peso;
		Resolucon = resolucon;
		this.wifi = wifi;
		this.puertosUSB = puertosUSB;
		this.almacenamiento = almacenamiento;
	}
	//Getters y Setters
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
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public boolean isLaptop() {
		return laptop;
	}
	public void setLaptop(boolean laptop) {
		this.laptop = laptop;
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
	public String getResolucon() {
		return Resolucon;
	}
	public void setResolucon(String resolucon) {
		Resolucon = resolucon;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public int getPuertosUSB() {
		return puertosUSB;
	}
	public void setPuertosUSB(int puertosUSB) {
		this.puertosUSB = puertosUSB;
	}
	public double almacenamiento() {
		return almacenamiento;
		}
	public void almacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", color=" + color + ", RAM=" + RAM + ", laptop=" + laptop + ", modelo="
				+ modelo + ", peso=" + peso + ", Resolucon=" + Resolucon + ", wifi=" + wifi + ", puertosUSB="
				+ puertosUSB + ", almacenamiento=" + almacenamiento + "]";
	}
	
	
	//ToString
	
	
	
	
}
