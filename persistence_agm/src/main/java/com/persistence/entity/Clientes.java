package com.persistence.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//no necesita los constructores 

//SOLO SE USA COMO SE ENCUENTRA EN EL SISTEMA DE ORACLE Y COMO ES
@Entity
@Table(name = "CUSTOMERS") //TABLA DE ORACLE
public class Clientes {

	public Clientes() {
	}

	private Clientes(int id) {
		this.clienteId = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	int clienteId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	String nombre;
	@Column(name = "FECHA_NAC", columnDefinition = "DATE")
	LocalDate fechaNac;
	@Column(name = "DOMICILIO", columnDefinition = "NVARCHAR2(40)")
	String direccion;
	
	@OneToMany(mappedBy="clienteId")
	// Getters y setters
	
	private List<Ventas> ventas;

	public int getClienteId() {
		return clienteId;
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


