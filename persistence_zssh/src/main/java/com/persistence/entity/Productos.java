package com.persistence.entity;

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

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	 private int productoId;
	@Column(name="DEPTO_ID", columnDefinition="NUMBER")
	 private int deptoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	 private String nombre;
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	 private LocalDate fechaCad;
	@Column(name="PRECIO_COMPRA", columnDefinition="NUMBER(5,2)")
	 private double precioCompra;
	@Column(name="PRECIO_VENTA", columnDefinition="NUMBER(5,2)")
	 private double precioVenta;
	@Column(name="REFRIGERADO", columnDefinition="CHAR(1)")
	 private String refrigerado;
	
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
	public LocalDate getFechaCad() {
		return fechaCad;
	}
	public void setFechaCad(LocalDate fechaCad) {
		this.fechaCad = fechaCad;
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
