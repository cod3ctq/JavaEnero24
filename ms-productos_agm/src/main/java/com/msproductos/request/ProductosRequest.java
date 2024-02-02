package com.msproductos.request;

import java.time.LocalDate;
//import jakarta.validation.constraints.;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;


public class ProductosRequest {

	private int productoId;
	int deptoId;
	@NotBlank(message="El nombre no puede quedar vacio o con espacios en blanco")
	private String nombre;
	
	@FutureOrPresent(message="La fecha no debe ser del pasado por caducidad")
	private LocalDate fechaCad;
	
	@Max(value=(long) 999.99 ,message="El valor maximo permitido es de 999.99")
	private double precioCompra;
	
	@Max(value=(long)999.99, message="El valor maximo permitido es de 999.99")
	private double precioVenta;
	
	//String nombre;    como se utiliza el NotBlank se quita la variable sola
	//LocalDate fechaCad;
//	int precioCompra;
//	int precioVenta;
	String refrigerado;
	
	public ProductosRequest(int productoId, int deptoId, String nombre, LocalDate fechaCad, int precioCompra,
			int precioVenta, String refrigerado) {
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
