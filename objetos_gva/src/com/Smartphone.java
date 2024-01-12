package com;

// La herencia se aplica con "extends"
public class Smartphone extends Celular {

	// Atributo objeto
	// para agregar objetos a mi objeto
	// principal, agregando cosas
	// complejas volviendolas mas
	// sencillas.Anidando clases

	Pantalla display;
	Procesador cpu;

	// Podemos hacer atributos complejos
	// como los array e incluirlos
	// dentro de un modelo:

//	Camara[] cams; // Para cuando hay
	// mas de 1

	// Solo hay que hacer un constructor
	// vacio para poder utilizarlo.
	public Smartphone() {

	}

	public Smartphone(String marca, String color, boolean liberado, double mAh, String modelo, double peso,
			Pantalla display, Procesador cpu) {
		super(marca, color, liberado, mAh, modelo, peso); // Aqui si tiene sentido dejarla y no borrarla
		this.display = display;
		this.cpu = cpu;
	}

	// ____________________________________________________________________
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

//____________________________________________________________________
	@Override
	public String toString() {
		return "Smartphone [display=" + display + ", cpu=" + cpu + ", marca=" + marca + ", color=" + color
				+ ", liberado=" + liberado + ", mAh=" + mAh + ", modelo=" + modelo + ", peso=" + peso + "]";
	}

	// ____________________________________________________________________
	
	// Metodo nativo solo de la clase hija (una accion que puede hacer que
	// la clase padre no puede)
	
	public void mandarWhatsapp(String mensaje) {
		System.out.println("Mensaje enviado: " + mensaje);
	}

}
