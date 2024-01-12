package COM;

//Modelo, Plantilla
//QUE y COMO
public class Celular {

	//Atributos
	//marca,parlante, durabilidad, color, compañia, bateria
	//modelo, peso
	
	String marca;
	String color;
	boolean liberado;
	double mAh;
	String modelo;
	double peso;
	
	
	//Costructoresç
	// Instacia un objeto con los valores dafault de los tipos de datos 
	public Celular() {
	
	}

	//este metodo crea un objeto con valores reales desde el inicio
	public Celular(String marca, String color, boolean liberado, double mAh, String modelo, double peso) {
		this.marca = marca;
		this.color = color;
		this.liberado = liberado;
		this.mAh = mAh;
		this.modelo = modelo;
		this.peso = peso;
	}

// Getter & Setters
	
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

// toString 
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", liberado=" + liberado + ", mAh=" + mAh + ", modelo="
				+ modelo + ", peso=" + peso + "]";
	}
	

	
	

}


