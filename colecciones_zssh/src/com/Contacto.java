package com;

public class Contacto {

	String nombre;
	String direccion;
	String numero;
	String correo;
	
	public Contacto() {
		
	}

	public Contacto(String nombre, String direccion, String numero, String correo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numero = numero;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "contacto [nombre=" + nombre + ", direccion=" + direccion + ", numero=" + numero + ", correo=" + correo
				+ "]";
	}
	
	
	
	
}
