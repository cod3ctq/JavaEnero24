package com.persistence.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPLEADOS")
public class Empleados {
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*@SequenceGenerator(name = "cid_auto", sequenceName ="CLIENTE_SEQ")*/
	
	
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="FECHA_INGRESO", columnDefinition="DATE")
	private LocalDate fechaIng;
	@Column(name="SALARIO", columnDefinition="NUMBER")
	private String salario;
	
	@OneToMany(mappedBy="empleado")
	private List<Ventas> ventas;
	
	public Empleados() {}
	
	public Empleados(int empleadoId, String nombre, LocalDate fechaIng, String salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fechaIng = fechaIng;
		this.salario = salario;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaIng() {
		return fechaIng;
	}

	public void setFechaIng(LocalDate localDate) {
		this.fechaIng = localDate;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
}
