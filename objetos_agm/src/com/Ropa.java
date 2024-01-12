package com;
//Modelo, plantilla
	//que y como
public class Ropa {
	
	// cuando no tiene voy no ayuda como referencia
		//solo un metodo main para todo el proyecto
		
		//Atributos
		//marca,parlante,durabilidad,compañia,bateria
		//modelo,peso
		
		//identificar cada variable conforme a datos primitivos
		
		String material;
		String color;
		boolean calidad; //si o no el celular puede reconocer otros chip
		String diseño;
		boolean stretch;
      //constructores		
		//click derecho, source, generate constructor fields
		public Ropa(String material, String color, boolean calidad, String diseño, boolean stretch) {
			super();
			this.material = material;
			this.color = color;
			this.calidad = calidad;
			this.diseño = diseño;
			this.stretch = stretch;
		}
		//Getters and setters
		//click derecho,source, generate  getters and setters

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isCalidad() {
			return calidad;
		}

		public void setCalidad(boolean calidad) {
			this.calidad = calidad;
		}

		public String getDiseño() {
			return diseño;
		}

		public void setDiseño(String diseño) {
			this.diseño = diseño;
		}

		public boolean isStretch() {
			return stretch;
		}

		public void setStretch(boolean stretch) {
			this.stretch = stretch;
		}

		@Override
		public String toString() {
			return "Ropa [material=" + material + ", color=" + color + ", calidad=" + calidad + ", diseño=" + diseño
					+ ", stretch=" + stretch + "]";
		}
		
		//toString// click derecho, source,generate to string
		
		
		
		//---COMPORTAMIENTO
	    //Metodos nativos (son de la misma categoria eso quiere decir que los metodos se crearon en el mismo formato)
		//Metodos heredados (comunmente se sobreescriben)
		//Metodos implementados (traidos de una interface)(un contrato de acciones)lo que comunica A con B
	}

