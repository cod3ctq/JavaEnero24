package com;

//La herencia se aplica con extends
public class Smartphone extends Celular{
	
	//Atributo objeto
	Pantalla display;
	Procesador cpu;
	//Camara cams; //Marca error porque no existe el objeto
	
	//Podemos hacer atributos complejos como los array e incluirlos 
	//dentro de un modelo
	//Camara[] cams;
	
	
	public Smartphone () {
		
	}

	public Smartphone(String marca, String color, boolean liberado, double mAh, String modelo, double peso,
			Pantalla display, Procesador cpu) {
		super(marca, color, liberado, mAh, modelo, peso); //No se borra cuando tiene clase padre
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
	
	
	//Todo lo que le pertenece a la calse hija
	//Mertodo nativo solo de la clase hija
	public void mandarWhatsapp(String mensaje) {
		System.out.println("Mensaje enviado : "+mensaje);
	}

}
