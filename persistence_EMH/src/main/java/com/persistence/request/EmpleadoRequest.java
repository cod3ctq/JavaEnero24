package com.persistence.request;

import java.time.LocalDate;

public class EmpleadoRequest {
	
	public EmpleadoRequest() {
		
	}
	
	public EmpleadoRequest(int id) {
		this.empleadoId = id;
	}

	private int empleadoId;
	private String nombre;
	private LocalDate FechaIngreso;
	private double salario;
	
	public EmpleadoRequest(int empleadoId, String nombre, LocalDate fechaIngreso, double salario) {
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		FechaIngreso = fechaIngreso;
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

	@Override
	public String toString() {
		return "EmpleadoRequest [empleadoId=" + empleadoId + ", nombre=" + nombre + ", FechaIngreso=" + FechaIngreso
				+ ", salario=" + salario + "]";
	}
	

}
