package com.persistence.request;

import java.time.LocalDate;
import java.util.List;

import com.persistence.dto.DetalleDTO;

//POJO
public class VentaRequest {
	
	//No lleva anotaciones
	//Si necesita los constructores, todos lo miembro por dfault

	private int ventaId;
	private int empleadoId;
	private int clienteId;
	private LocalDate fechaVenta;
	private int subtotal;
	private int total;
	
	private List<DetalleDTO> detalles;
	
	
	
	public VentaRequest () {

	}
	
	


	public VentaRequest(int ventaId, int empleadoId, int clienteId, LocalDate fechaVenta, int subtotal, int total,
			List<DetalleDTO> detalles) {
		super();
		this.ventaId = ventaId;
		this.empleadoId = empleadoId;
		this.clienteId = clienteId;
		this.fechaVenta = fechaVenta;
		this.subtotal = subtotal;
		this.total = total;
		this.detalles = detalles;
	}




	public List<DetalleDTO> getDetalles() {
		return detalles;
	}




	public void setDetalles(List<DetalleDTO> detalles) {
		this.detalles = detalles;
	}




	public VentaRequest(int ventaId, int empleadoId, int clienteId, LocalDate fechaVenta, int subtotal, int total) {
		super();
		this.ventaId = ventaId;
		this.empleadoId = empleadoId;
		this.clienteId = clienteId;
		this.fechaVenta = fechaVenta;
		this.subtotal = subtotal;
		this.total = total;
	}


	public int getVentaId() {
		return ventaId;
	}


	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
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


	@Override
	public String toString() {
		return "VentaRequest [ventaId=" + ventaId + ", empleadoId=" + empleadoId + ", clienteId=" + clienteId
				+ ", fechaVenta=" + fechaVenta + ", subtotal=" + subtotal + ", total=" + total + "]";
	}
	
	
	
}
