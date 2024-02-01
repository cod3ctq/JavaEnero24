package com.msproductos.entity;

import java.time.LocalDate;
import java.util.List;

import com.persistence.entity.Ventas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Productos {
	
	public Productos () {}
	 public Productos (int id) {
		 this.productoId = id;
	 }
	
	//No necesita los constructores
	
	
	@Id
	/*@GenerateValue(strategy=GenerationType.SEQUENCE, generator= "cid_auto")*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*@sequenceGenerator(name = "cid_auto", sequenceName = "CLIENTE_SEQ")*/

	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private int productoId;
	@Column(name="DEPTO_ID", columnDefinition="NUMBER")
	private int deptoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR(20)")
	private String nombre;
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	private LocalDate fechaCad;
	@Column(name="PRECIO_COMPRA", columnDefinition="NUMBER")
	private int precioCompra;
	@Column(name="PRECIO_VENTA", columnDefinition="NUMBER")
	private int precioVenta;
	@Column(name="REFRIGERADO", columnDefinition="CHAR")
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

	
	

}
