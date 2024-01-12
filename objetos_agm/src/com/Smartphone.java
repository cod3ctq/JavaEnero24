package com;

//la herencia se aplica con extends

public class Smartphone extends Celular {

	
	//atributo objeto: clase y objeto (un objeto dentro de otro objeto)
	
	Pantalla pantalla;
	Procesador cpu;
	
	//podemos hacer atributos complejos como 
	//los array e incluirlos dentro de un modelo
	
	//Camara[] cams; 
	
	
	
	public Smartphone() {
	
	}

	public Smartphone(String marca, String color, boolean liberado, double mAh, String modelo, double peso,
			Pantalla pantalla, Procesador cpu) {
		
		
		super(marca, color, liberado, mAh, modelo, peso);
		this.pantalla = pantalla;
		this.cpu = cpu;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override //con inherit fields
	public String toString() {
		return "Smartphone [pantalla=" + pantalla + ", cpu=" + cpu + ", marca=" + marca + ", color=" + color
				+ ", liberado=" + liberado + ", mAh=" + mAh + ", modelo=" + modelo + ", peso=" + peso + "]";
	}
public void mandarWhatsapp(String mensaje) {
	System.out.println("Mensaje enviado: " + mensaje);
	
	//c2.m
}
	
	
	
	
	//sistemaOperativo
	
}
