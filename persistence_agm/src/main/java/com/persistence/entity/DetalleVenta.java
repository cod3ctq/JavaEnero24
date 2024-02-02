package com.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
		@Table(name="DET_VENTA")
public class DetalleVenta {

	//no necesita los constructores
		
			
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)			
			@Column(name="DET_VENTA_ID", columnDefinition="NUMBER")
			int detVentaId;
			@Column(name="VENTA_ID", columnDefinition="NUMBER")
			int ventaId;
			@Column(name="PRODUCTO_ID", columnDefinition="NVARCHAR2(15)")
			int productoId;
			@Column(name="CANTIDAD", columnDefinition="NUMBER")
			int cantidad;
			
			public int getDetVentaId() {
				return detVentaId;
			}
			public void setDetVentaId(int detVentaId) {
				this.detVentaId = detVentaId;
			}
			public int getVentaId() {
				return ventaId;
			}
			public void setVentaId(int ventaId) {
				this.ventaId = ventaId;
			}
			public int getProductoId() {
				return productoId;
			}
			public void setProductoId(int productoId) {
				this.productoId = productoId;
			}
			public int getCantidad() {
				return cantidad;
			}
			public void setCantidad(int cantidad) {
				this.cantidad = cantidad;
			}
			
			
	//		int producto;
//		double precioVenta;
//		int cantidad;
}