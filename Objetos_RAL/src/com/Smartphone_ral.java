package com;
//La herencia se aplica con exetend
public class Smartphone_ral extends Celular_ral{
	//atributo objeto
	Pantalla_ral display;
	Procesador_ral cpu;
	//Podemos hacer atributos complejos como
	//los array e incluirlos dentro de un modelo
	//Camara_ral [] cam; 	

		public Smartphone_ral() {
			
		}

		public Smartphone_ral(String marca, String color, boolean liberado, double mAh, String modelo, double peso,
				Pantalla_ral pantalla, Procesador_ral cpu) {
			super(marca, color, liberado, mAh, modelo, peso);
			this.display = pantalla;
			this.cpu = cpu;
		}

		public Pantalla_ral getDisplay() {
			return display;
		}

		public void setDisplay(Pantalla_ral display) {
			this.display = display;
		}

		public Procesador_ral getCpu() {
			return cpu;
		}

		public void setCpu(Procesador_ral cpu) {
			this.cpu = cpu;
		}

		@Override
		public String toString() {
			return "Smartphone_ral [display=" + display + ", cpu=" + cpu + ", marca=" + marca + ", color=" + color
					+ ", liberado=" + liberado + ", mAh=" + mAh + ", modelo=" + modelo + ", peso=" + peso + "]";
		}

		//metodo nativo de la clase hija
		public void mandarWsp(String mensaje) {
			System.out.println("Mmensaje enviado" + mensaje);
		}
		
		
		
	
	
}
