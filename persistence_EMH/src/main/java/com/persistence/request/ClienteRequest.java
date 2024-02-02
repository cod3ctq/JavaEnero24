package com.persistence.request;

import java.time.LocalDate;

//POJO
public class ClienteRequest {
	
	//No lleva anotaciones
	//Si necesita los constructores
	
	public ClienteRequest() {}
	public ClienteRequest(int id) {
		this.clienteId = id;
	}
	
	private int clienteId;
	private String nombre;
	private LocalDate FechaNa;
	private String domicilio;
	
	public ClienteRequest(int clienteId, String nombre, LocalDate fechaNa, String domicilio) {
		this.clienteId = clienteId;
		this.nombre = nombre;
		FechaNa = fechaNa;
		this.domicilio = domicilio;
	}
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNa() {
		return FechaNa;
	}
	public void setFechaNa(LocalDate fechaNa) {
		FechaNa = fechaNa;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	@Override
	public String toString() {
		return "ClienteRequest [clienteId=" + clienteId + ", nombre=" + nombre + ", FechaNa=" + FechaNa + ", domicilio="
				+ domicilio + "]";
	}

}
