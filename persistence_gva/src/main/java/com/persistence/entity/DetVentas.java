package com.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DET_VENTA")
public class DetVentas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DET_VENTA_ID", columnDefinition = "NUMBER")
	private int detVentaId;
	
	
//	@ManyToOne
	@Column(name = "VENTA_ID", columnDefinition = "NUMBER")
	private int ventaId;
	
	
//	@ManyToOne
	@JoinColumn(name = "PRODUCTO_ID", columnDefinition = "NUMBER")
	private int productoId;
	
	@Column(name = "CANTIDAD", columnDefinition = "NUMBER")
	private int cantidad;
	
	
	
	public int getDetVentaId() {
		return detVentaId;
	}
	public void setDetVentaId(int detVentaId) {
		this.detVentaId = detVentaId;
	}
	
//	public Ventas getVentas() {
//		return ventas;
//	}
//	public void setVentas(Ventas ventas) {
//		this.ventas = ventas;
//	}
	
	


	public int getVentaId() {
		return ventaId;
	}
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
