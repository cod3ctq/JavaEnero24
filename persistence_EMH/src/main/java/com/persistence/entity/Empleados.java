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
	
	/*
	public Empleados(int id) {
		this.empleadoId = id;
	}*/

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	
	
	@Column(name="FECHA_INGRESO", columnDefinition="DATE")
	private LocalDate FechaIngreso;
	
	
	
	@Column(name="SALARIO", columnDefinition="NUMBER(5,2)")
	private double salario;
	
	
	@OneToMany(mappedBy="empleadoId")
	private List<Empleados> empleados;
	
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


	public LocalDate getFechaIngreso() {
		return FechaIngreso;
	}


	public void setFechaIngreso(LocalDate fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
