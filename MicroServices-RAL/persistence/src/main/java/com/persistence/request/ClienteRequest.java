package com.persistence.request;
import java.time.LocalDate;


//POJO
public class ClienteRequest {

//no lleva anotaciones
// si necesita los constructores
//getters and setters

	
	private int clienteId;
	private String nombre;
	private LocalDate fechaNac;
	private String domicilio;
	
	public ClienteRequest() {}
	
	public ClienteRequest(int clienteId, String nombre, LocalDate fechaNac, String domicilio) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
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

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
	
	
}