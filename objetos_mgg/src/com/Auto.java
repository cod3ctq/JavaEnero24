package com;

public class Auto {

	//Atributos:
    //Ahorro de combustible, placa, color, numero de puertas, tipo de caja, marca
	
	boolean ahorroDeCombustible;
	String placa;
	String color;
	int numeroDePuertas;
	String tipoDeCaja;
	String marca;
	
	
	//camelCase
	
public Auto() {
		
	}


	public Auto(boolean ahorroDeCombustible, String placa, String color, int numeroDePuertas, String tipoDeCaja,
			String marca) {
		super();
		this.ahorroDeCombustible = ahorroDeCombustible;
		this.placa = placa;
		this.color = color;
		this.numeroDePuertas = numeroDePuertas;
		this.tipoDeCaja = tipoDeCaja;
		this.marca = marca;
	}


	public boolean isAhorroDeCombustible() {
		return ahorroDeCombustible;
	}


	public void setAhorroDeCombustible(boolean ahorroDeCombustible) {
		this.ahorroDeCombustible = ahorroDeCombustible;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}


	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}


	public String getTipoDeCaja() {
		return tipoDeCaja;
	}


	public void setTipoDeCaja(String tipoDeCaja) {
		this.tipoDeCaja = tipoDeCaja;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Auto [ahorroDeCombustible=" + ahorroDeCombustible + ", placa=" + placa + ", color=" + color
				+ ", numeroDePuertas=" + numeroDePuertas + ", tipoDeCaja=" + tipoDeCaja + ", marca=" + marca + "]";
	}






	
}
