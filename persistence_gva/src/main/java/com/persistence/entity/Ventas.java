package com.persistence.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "VENTAS")
public class Ventas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "VENTA_ID", columnDefinition = "NUMBER")
	private int ventaId;
	
	@ManyToOne
	@JoinColumn(name = "EMPLEADO_ID", columnDefinition = "NUMBER")
	private Empleados empleado;
	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private Clientes cliente;
	
	@Column(name = "FECHA_VENTA", columnDefinition = "DATE")
	private LocalDate fechaVenta;
	@Column(name = "SUBTOTAL", columnDefinition = "NUMBER(5,2)")
	private double subtotal;
	@Column(name = "TOTAL", columnDefinition = "NUMBER(5,2)")
	private double total;
	
	
	
//	@OneToMany(mappedBy="ventas")
//	private List<DetVentas> ventas;
//	
//	
//	
//	
//	public List<DetVentas> getVentas() {
//		return ventas;
//	}
//	public void setVentas(List<DetVentas> ventas) {
//		this.ventas = ventas;
//	}
	public int getVentaId() {
		return ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}
	

	public Empleados getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
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
