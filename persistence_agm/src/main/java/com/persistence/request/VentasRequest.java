package com.persistence.request;

import java.time.LocalDate;
import java.util.List;

import com.persistence.dto.DetalleDTO;

public class VentasRequest {
	
public VentasRequest(int id) {
		this.ventaId = id;
	}
 int ventaId;
	
private int empleadoId;
private int clienteId;
private LocalDate fechaVenta;
private Double subtotal;
private Double total;

 private List<DetalleDTO> detalles;


public VentasRequest(int ventaId, int empleadoId, int clienteId, LocalDate fechaVenta, Double subtotal, Double total,
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
public Double getSubtotal() {
	return subtotal;
}
public void setSubtotal(Double subtotal) {
	this.subtotal = subtotal;
}
public Double getTotal() {
	return total;
}
public void setTotal(Double total) {
	this.total = total;
}
	

}
