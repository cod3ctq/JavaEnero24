package com.persistence.request;

import java.time.LocalDate;

//POJO
public class EmpleadoRequest {
	
	//No lleva anotaciones
	//Si necesita los constructores, todos lo miembro por dfault


	private int empleadoId;
	private String nombre;
	private LocalDate fecha;
	private int salario;
		
		
	public EmpleadoRequest () {

	}


	public EmpleadoRequest(int empleadoId, String nombre, LocalDate fecha, int salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fecha = fecha;
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


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "EmpleadoRequest [empleadoId=" + empleadoId + ", nombre=" + nombre + ", fecha=" + fecha + ", salario="
				+ salario + "]";
	}		
	
	
	
	
}
