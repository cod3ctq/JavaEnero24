package com;

//la herencia se aplica con extends
public class Smartphone extends Celular {
	
	//atributoObjeto
	//Clase  n_Objeto
	Pantalla display;
	Procesador cpu;
	
	//podemos hacer atributos completos como los array e incliurlos dentro de un modelo
	//Camara[] cam;
	
	public Smartphone() {

	}

	public Smartphone(String marca, String color, boolean liberado, double mAh, String modelo, double peso,
			Pantalla display, Procesador cpu) {
		super(marca, color, liberado, mAh, modelo, peso);
		this.display = display;
		this.cpu = cpu;
	}

	public Pantalla getDisplay() {
		return display;
	}

	public void setDisplay(Pantalla display) {
		this.display = display;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Smartphone [display=" + display + ", cpu=" + cpu + ", marca=" + marca + ", color=" + color
				+ ", liberado=" + liberado + ", mAh=" + mAh + ", modelo=" + modelo + ", peso=" + peso + "]";
	}

	//Metodo nativo solo en la clase hija
	public void mandarhatsapp(String mensaje) {
		System.out.println("Mensaje enviado" +mensaje);
	}
	
	
	
	
}
