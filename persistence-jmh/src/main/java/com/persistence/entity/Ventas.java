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

	//No necesita los constructores
	
	@Id
	/*@GenerateValue(strategy=GenerationType.SEQUENCE, generator= "cid_auto")*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*@sequenceGenerator(name = "cid_auto", sequenceName = "CLIENTE_SEQ")*/

	
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	private int ventaId;
	
	@ManyToOne
	@JoinColumn (name="EMPLEADO_ID", columnDefinition="NUMBER")
	private Empleados empleado;
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition="NUMBER")
	private Clientes cliente;
	
	@Column(name="FECHA_VENTA", columnDefinition="DATE")
	private LocalDate fechaVenta;
	@Column(name="SUBTOTAL", columnDefinition="NUMBER")
	private int subtotal;
	@Column(name="TOTAL", columnDefinition="NUMBER")
	private int total;
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
	
	
	
	
	


}
