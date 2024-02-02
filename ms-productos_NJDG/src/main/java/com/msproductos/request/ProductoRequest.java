package com.msproductos.request;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.;



public class ProductoRequest {

public ProductoRequest() {}

    public ProductoRequest(int id) {
	   this.productoId=id;
	
}
    private int productoId;
	private int deptoId;	
	@NotBlank(message="El nombre no ouede quedar vacio o con espacios en blanco")
	private String nombre;	
	
	@FutureOrPresent(message="La fechano debe ser del pasado")
	private LocalDate fechacad;	
	
	@Max(value=(long) 999.99, message="El valor maximo permitido es de 999.99")
	private double precioCompra;
	
	@Max(value=(long) 999.99, message="El valor maximo permitido es de 999.99")
	private double precioVenta;
	
	private char refrigerado;

	public ProductoRequest(int productoId, int deptoId,
			@NotBlank(message = "El nombre no ouede quedar vacio o con espacios en blanco") String nombre,
			@FutureOrPresent(message = "La fechano debe ser del pasado") LocalDate fechacad,
			@Max(value = 999, message = "El valor maximo permitido es de 999.99") double precioCompra,
			@Max(value = 999, message = "El valor maximo permitido es de 999.99") double precioVenta,
			char refrigerado) {
		super();
		this.productoId = productoId;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fechacad = fechacad;
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

	public LocalDate getFechacad() {
		return fechacad;
	}

	public void setFechacad(LocalDate fechacad) {
		this.fechacad = fechacad;
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

	public char getRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}

	

}
