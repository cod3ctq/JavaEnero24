package com.persistence.request;

import java.time.LocalDate;
import java.util.List;

import com.persistence.dto.DetalleDTO;


public class VentasRequest {
	
	public VentasRequest() {}
	
	public VentasRequest(int id) {
		this.ventasId=id;
	}
		
	private int ventasId;
	private int empleadoId;
	private int clienteId;
	private LocalDate fechaVenta;
	private int subtotal;
	private int total;
	
	private List<DetalleDTO>detalles;
	
	
	public VentasRequest(int ventasId, int empleadoId, int clienteId, LocalDate fechaVenta, int subtotal, int total) {
		super();
		this.ventasId = ventasId;
		this.empleadoId = empleadoId;
		this.clienteId = clienteId;
		this.fechaVenta = fechaVenta;
		this.subtotal = subtotal;
		this.total = total;
	}

	public int getVentasId() {
		return ventasId;
	}

	public void setVentasId(int ventasId) {
		this.ventasId = ventasId;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<DetalleDTO> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleDTO> detalles) {
		this.detalles = detalles;
	}
	
	
	
	
	
	
	
}
