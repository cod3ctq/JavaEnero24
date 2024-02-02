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
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	 private int productoId;
	@Column(name="DEPTO_ID", columnDefinition="NUMBER")
	 private int deptoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	private String nombre;
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	private LocalDate fechacad;
	@Column(name="PRECIO_COMPRA", columnDefinition="NVARCHAR2(5,2)")
	private String precioCompra;
	@Column(name="PRECIO_VENTA", columnDefinition="NVARCHAR2(5,2)")
	private String precioVenta;
	@Column(name="REFRIGERADO", columnDefinition="CHAR(1)")
	private char refrigerado;
	
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
	public String getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(String precioCompra) {
		this.precioCompra = precioCompra;
	}
	public String getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(String precioVenta) {
		this.precioVenta = precioVenta;
	}
	public char getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}
	
}
