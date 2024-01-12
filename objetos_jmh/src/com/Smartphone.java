package com;

//La herencia se aplica con extends
public class Smartphone extends Celular {
	
	//atributo objeto
	Pantalla display;
	Procesador cpu;
	
//	Podemos hacer atributos complejos con
//	los array e incluirlos dentro de un molde
//	Camara [] cams;
	
	public Smartphone () {
		
	}

	
	


	

	public Smartphone(String marca, String color, boolean liberado, double maH, String modelo, double peso,
		Pantalla display, Procesador cpu) {
	super(marca, color, liberado, maH, modelo, peso);
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
				+ ", liberado=" + liberado + ", maH=" + maH + ", modelo=" + modelo + ", peso=" + peso + "]";
	}
	
	//Metodo nativo solo de la clase hija
	public void mandarWhatsapp (String mensaje) {
		System.out.println("Mensaje enviado:" + mensaje);
	}
	
	
	


}
	
	
	//sistemaOperativo
	


