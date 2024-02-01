package com.persistence.request;

import java.time.LocalDate;



public class EmpleadosRequest {

	public EmpleadosRequest() {
		
	}
	
	public EmpleadosRequest(int id) {
		this.empleadosId=id;
	}
	
	private int empleadosId;
	private String nombre;
	private LocalDate fechaIngreso;
	private int salario;
	
	
	public EmpleadosRequest(int empleadosId, String nombre, LocalDate fechaIngreso, int salario) {
		super();
		this.empleadosId = empleadosId;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}

	public int getEmpleadosId() {
		return empleadosId;
	}

	public void setEmpleadosId(int empleadosId) {
		this.empleadosId = empleadosId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
