package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {

	public Cliente() {}
	public Cliente(int id) {
		this.clienteId = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "CLIENTE_ID", columnDefinition = "NUMBER")
	int clienteId;
	
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(20)")
	String nombre;
	@Column(name="DIRECCION", columnDefinition = "NVARCHAR2(50)")
	String direccion;
	@Column(name="DNI", columnDefinition = "NVARCHAR2(10)")
	String dni;
	@Column(name="TEL", columnDefinition = "NVARCHAR2(10)")
	String telefono;
	//Getters & Setters
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
