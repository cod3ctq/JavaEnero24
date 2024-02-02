package com.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="DET_VENTA")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName ="DET_VENTA_SEQ", allocationSize=1)
	@Column(name="DET_VENTA_ID", columnDefinition="NUMBER")
	private int detalleVentaId;
	
	
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	private int ventaIdFk;
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private int productoIdFK;
	@Column(name="CANTIDAD", columnDefinition="NUMBER")
	private int cantidad;
	
	
	public int getDetalleVentaId() {
		return detalleVentaId;
	}
	public void setDetalleVentaId(int detalleVentaId) {
		this.detalleVentaId = detalleVentaId;
	}
	public int getVentaIdFk() {
		return ventaIdFk;
	}
	public void setVentaIdFk(int ventaIdFk) {
		this.ventaIdFk = ventaIdFk;
	}
	public int getProductoIdFK() {
		return productoIdFK;
	}
	public void setProductoIdFK(int productoIdFK) {
		this.productoIdFK = productoIdFK;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

}
