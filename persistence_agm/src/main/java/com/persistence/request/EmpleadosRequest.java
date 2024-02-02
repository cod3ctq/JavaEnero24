package com.persistence.request;

import java.time.LocalDate;

public class EmpleadosRequest {

	private int empleadoId;
	// necesita los constructores
	
	

		private String nombre;
		private LocalDate fechaIngreso;
		private String salario;
		public int getEmpleadoId() {
			return empleadoId;
		}
		public EmpleadosRequest(int empleadoId, String nombre, LocalDate fechaIngreso, String salario) {
			super();
			this.empleadoId = empleadoId;
			this.nombre = nombre;
			this.fechaIngreso = fechaIngreso;
			this.salario = salario;
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
		public String getSalario() {
			return salario;
		}
		public void setSalario(String salario) {
			this.salario = salario;
		}
		public void setEmpleadoId(int empleadoId) {
			this.empleadoId = empleadoId;
		}
		
}

