package com;

public class NavajaSuiza extends Cuchilla{

	Tijeras tijeras;
	Destornillador destor;
	Cuchilla cuc;
	
//	String color;
//	String marca;
//	double precio;
	
	public NavajaSuiza(){
		
	}

	public NavajaSuiza(String filo, String material, int cantidad, Tijeras tijeras, Destornillador destor, Cuchilla cuc,
			String color, String marca, double precio) {
		super(filo, material, cantidad);
		this.tijeras = tijeras;
		this.destor = destor;
		this.cuc = cuc;
//		this.color = color;
//		this.marca = marca;
//		this.precio = precio;
	}

	public Tijeras getTijeras() {
		return tijeras;
	}

	public void setTijeras(Tijeras tijeras) {
		this.tijeras = tijeras;
	}

	public Destornillador getDestor() {
		return destor;
	}

	public void setDestor(Destornillador destor) {
		this.destor = destor;
	}

	public Cuchilla getCuc() {
		return cuc;
	}

	public void setCuc(Cuchilla cuc) {
		this.cuc = cuc;
	}

//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public String getMarca() {
//		return marca;
//	}

//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//
//	public double getPrecio() {
//		return precio;
//	}
//
//	public void setPrecio(double precio) {
//		this.precio = precio;
//	}

	@Override
	public String toString() {
		return "NavajaSuiza [tijeras=" + tijeras + ", destor=" + destor + ", cuc=" + cuc + ", color=" 
				+  ", filo=" + filo + ", material=" + material
				+ ", cantidad=" + cantidad + "]";
	}

	
	
	
}
