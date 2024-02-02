package com.persistence.request;

import java.time.LocalDate;

//pojo
public class ClienteRequest {
	
	//no lleva anotaciones
	//necesita los constructores getters y setters
	
	private int clienteId;
	
		String nombre;
		LocalDate fechaNac;
		String direccion;
		
		public int getClienteId() {
			return clienteId;
		}

		public ClienteRequest(int clienteId, String nombre, LocalDate fechaNac, String direccion) {
			super();
			this.clienteId = clienteId;
			this.nombre = nombre;
			this.fechaNac = fechaNac;
			this.direccion = direccion;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public LocalDate getFechaNac() {
			return fechaNac;
		}

		public void setFechaNac(LocalDate fechaNac) {
			this.fechaNac = fechaNac;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public void setClienteId(int clienteId) {
			this.clienteId = clienteId;
		}
		
		


}
