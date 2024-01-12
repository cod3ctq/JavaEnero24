package com;

public abstract class Calculadora {

	String size, battery, brand; // Pendiente

	public Calculadora() {
	}

	public Calculadora(String size, String battery, String brand) {
		super();
		this.size = size;
		this.battery = battery;
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Calculadora [size=" + size + ", battery=" + battery + ", brand=" + brand + "]";
	}

	public abstract void operacBasics();

}
