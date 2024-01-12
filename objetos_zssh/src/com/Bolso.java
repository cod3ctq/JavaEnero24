package com;

public class Bolso {
	//Miembros:
	//Atributos
	//marca,color,tamaño,estilo,precio,material,importado --->Son datos que necesito controlar o no?

	String marca;
	String color;
	String tamaño;
	String estilo;
	double precio;
	String material;
	boolean importado;
	String modelo;
	
	//Constructores
	//Instancia un objeto con los valores default de los tipos de datos
	public Bolso() {
		
	}
	//Este metodo crea un objeto con valores reales desde el inicio

	public Bolso(String marca, String color, String tamaño, String estilo, double precio, String material,
			boolean importado, String modelo) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
		this.estilo = estilo;
		this.precio = precio;
		this.material = material;
		this.importado = importado;
		this.modelo = modelo;
	}
	//Getter & Setters 
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//toString
	@Override
	public String toString() {
		return "Bolso [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + ", estilo=" + estilo + ", precio="
				+ precio + ", material=" + material + ", importado=" + importado + ", modelo=" + modelo + "]";
	}
	
	
	
	

	
	
	
	
	
}



