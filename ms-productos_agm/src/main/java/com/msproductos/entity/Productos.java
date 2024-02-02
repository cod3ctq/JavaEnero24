package com.msproductos.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
	public class Productos {
	
	public Productos() {
		
	}
	private Productos(int id) {
		this.productoId = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	int productoId;
	@Column(name = "DEPTO_ID", columnDefinition = "NUMBER")
	int deptoId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(20 CHAR)")
	String nombre;
	@Column(name = "FECHA_CAD", columnDefinition = "DATE")
	LocalDate fechaCad;
	@Column(name = "PRECIO_COMPRA", columnDefinition = "NUMBER(5,2)")
	double precioCompra;
	@Column(name = "PRECIO_VENTA", columnDefinition = "NUMBER(5,2)")
	double precioVenta;
	@Column(name = "REFRIGERADO", columnDefinition = "CHAR(1 BYTE)")
	String refrigerado;
	
	//GETTERS AND SETTERS
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
