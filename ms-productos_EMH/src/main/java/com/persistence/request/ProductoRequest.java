package com.persistence.request;

import java.time.LocalDate;


public class ProductoRequest {
	
	public ProductoRequest () {
	}

	public ProductoRequest(int id) {
		super();
		this.productoid = id;
	}

	private int productoid;
	private int deptoid;
	private String nombre;
	private LocalDate fechacaducidad;
	private double preciocompra;
	private double precioventa;
	private char refrigerado;
	
	
	public ProductoRequest(int productoid, int deptoid, String nombre, LocalDate fechacaducidad, double preciocompra,
			double precioventa, char refrigerado) {
		super();
		this.productoid = productoid;
		this.deptoid = deptoid;
		this.nombre = nombre;
		this.fechacaducidad = fechacaducidad;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.refrigerado = refrigerado;
	}

	public int getProductoid() {
		return productoid;
	}

	public void setProductoid(int productoid) {
		this.productoid = productoid;
	}

	public int getDeptoid() {
		return deptoid;
	}

	public void setDeptoid(int deptoid) {
		this.deptoid = deptoid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechacaducidad() {
		return fechacaducidad;
	}

	public void setFechacaducidad(LocalDate fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}

	public double getPreciocompra() {
		return preciocompra;
	}

	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}

	public double getPrecioventa() {
		return precioventa;
	}

	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}

	public char getRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}
	

}
