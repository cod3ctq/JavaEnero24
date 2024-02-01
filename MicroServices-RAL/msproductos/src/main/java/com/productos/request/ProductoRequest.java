package com.productos.request;

import java.time.LocalDate;

public class ProductoRequest {

	private int productoId;
	private int deptoId;
	private String nombre;
	private LocalDate fechaCad;
	private double precioCompra;
	private double precioVenta;
	private String refrigerado;
	
	public ProductoRequest () {}


	public ProductoRequest(int productoId, int deptoId, String nombre, LocalDate fechaCad, double precioCompra,
			double precioVenta, String refrigerado) {
		super();
		this.productoId = productoId;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refrigerado = refrigerado;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getDeptoId() {
		return deptoId;
	}

	public void setDeptoId(int deptoId) {
		this.deptoId = deptoId;
	}

	
	public LocalDate getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(LocalDate fechaCad) {
		this.fechaCad = fechaCad;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRefrigerado() {
		return refrigerado;
	}



	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}

	
	
	
}
