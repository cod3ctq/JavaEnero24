package com.persistence.request;

public class DetalleVentaRequest {

	public DetalleVentaRequest() {
	}
	
	public DetalleVentaRequest(int id) {
		this.detalleVentaId = id;
	}

	private int detalleVentaId;
	private int ventaIdFk;
	private int productoIdFK;
	private int cantidad;
	
	public DetalleVentaRequest(int detalleVentaId, int ventaIdFk, int productoIdFK, int cantidad) {
		this.detalleVentaId = detalleVentaId;
		this.ventaIdFk = ventaIdFk;
		this.productoIdFK = productoIdFK;
		this.cantidad = cantidad;
	}

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

	@Override
	public String toString() {
		return "DetalleVentaRequest [detalleVentaId=" + detalleVentaId + ", ventaIdFk=" + ventaIdFk + ", productoIdFK="
				+ productoIdFK + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
}
