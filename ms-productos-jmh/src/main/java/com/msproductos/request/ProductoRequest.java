package com.msproductos.request;

import java.time.LocalDate;

public class ProductoRequest {
	
	private int productoId;
	private int deptoId;
	private String nombre;
	private LocalDate fechaCad;
	private int precioCompra;
	private int precioVenta;
	private char refrigerado;
	
	public ProductoRequest() {
		
	
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(LocalDate fechaCad) {
		this.fechaCad = fechaCad;
	}

	public int getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public char getRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}

	@Override
	public String toString() {
		return "ProductoRequest [productoId=" + productoId + ", deptoId=" + deptoId + ", nombre=" + nombre
				+ ", fechaCad=" + fechaCad + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta
				+ ", refrigerado=" + refrigerado + "]";
	}
	

	
	

	

}
