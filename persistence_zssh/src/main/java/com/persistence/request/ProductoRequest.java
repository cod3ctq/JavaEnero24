package com.persistence.request;

import java.time.LocalDate;

public class ProductoRequest {

	public ProductoRequest() {
		
	}
	public ProductoRequest(int id) {
		this.productoId=id;
	}
	 private int productoId;
	 private int deptoId;
	 private String nombre;
	 private LocalDate fechaCad;
	 private double precioCompra;
	 private double precioVenta;
	 private String refrigerado;
	 
	 
	 //
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
	public String getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}
	 
	 
	 
	 
}
