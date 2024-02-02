package com.persistence.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="VENTAS")
public class Ventas {

	// no necesita los constructores

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VENTA_ID", columnDefinition = "NUMBER")
	 int ventaId;
	
	@ManyToOne
	@JoinColumn(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	 Empleados empleadoId;
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	 Clientes clienteId;
	
	
	@Column(name = "FECHA_VENTA", columnDefinition = "DATE")
	 LocalDate fechaVenta;
	@Column(name = "SUBTOTAL", columnDefinition = "NUMBER(5,2)")
	 Double subtotal;
	@Column(name = "TOTAL", columnDefinition = "NUMBER(5,2)")
	 Double total;
	public int getVentaId() {
		return ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}
	
	public Empleados getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(Empleados empleadoId) {
		this.empleadoId = empleadoId;
	}
	public Clientes getClienteId() {
		return clienteId;
	}
	public void setClienteId(Clientes clienteId) {
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