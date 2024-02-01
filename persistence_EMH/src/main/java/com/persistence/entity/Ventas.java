package com.persistence.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="VENTAS")
public class Ventas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName ="VENTAS_SEQ", allocationSize=1)
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	private int ventaId;
	
	@ManyToOne
	@JoinColumn(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private Empleados empleadoId;
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
	private Clientes clienteId;
	
	@Column(name="FECHA_VENTA", columnDefinition="DATE")
	private LocalDate FechaVenta;
	
	@Column(name="SUBTOTAL", columnDefinition="NUMBER(5,2)")
	private double subtotal;
	@Column(name="TOTAL", columnDefinition="NUMBER(5,2)")
	private double total;
	
	
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
		return FechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		FechaVenta = fechaVenta;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
