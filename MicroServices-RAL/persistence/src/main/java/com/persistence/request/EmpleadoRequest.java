package com.persistence.request;

import java.time.LocalDate;


public class EmpleadoRequest {

	
	private int empleadoId;
	private String nombre;
	private LocalDate fechaIng;
	private String salario;
	
	public EmpleadoRequest() {}

	public EmpleadoRequest(int empleadoId, String nombre, LocalDate fechaIng, String salario) {
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

	public void setFechaIng(LocalDate fechaIng) {
		this.fechaIng = fechaIng;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	
	
}