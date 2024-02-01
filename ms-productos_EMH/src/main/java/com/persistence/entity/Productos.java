package com.persistence.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Productos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName ="PRODUCTOS_SEQ", allocationSize=1)
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private int productoid;
	
	
	@Column(name="DEPTO_ID", columnDefinition="NUMBER")
	private int deptoid;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	private String nombre;
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	private LocalDate fechacaducidad;
	@Column(name="PRECIO_COMPRA", columnDefinition="NUMBER(5,2)")
	private double preciocompra;
	@Column(name="PRECIO_VENTA", columnDefinition="NUMBER(5,2)")
	private double precioventa;
	@Column(name="REFRIGERADO", columnDefinition="CHAR(1)")
	private char refrigerado;
	
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
