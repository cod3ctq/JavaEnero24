package com.persistence.request;

import java.time.LocalDate;

public class EmpleadosRequest {
	private int empleadoId;
	private String nombre;
	private LocalDate fechaIngreso;
	private double salario;

	public EmpleadosRequest() {

	}

	public EmpleadosRequest(int empleadoId, String nombre, LocalDate fechaIngreso, double salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
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
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}