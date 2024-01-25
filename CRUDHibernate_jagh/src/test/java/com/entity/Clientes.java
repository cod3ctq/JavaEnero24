package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {
	
	
	public Clientes() {}
	public Clientes (int id) {
		this.clienteId = id;
	}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
int clienteId;

@Column(name="NOMBRE", columnDefinition="NVARCHAR(15)")
String nombre;
@Column(name="DIRECCION", columnDefinition="NVARCHAR(40)")
String direccion;
@Column(name="INE", columnDefinition="NVARCHAR(10)")
String ine;
@Column(name="TELEFONO", columnDefinition="NVARCHAR(10)")
String telefono;
//Getters & Setters
public int getClienteId() {
	return clienteId;
}
public void setClienteId(int clienteId) {
	this.clienteId = clienteId;
}
public String getNombre1() {
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
public String getIne() {
	return ine;
}
public void setIne(String ine) {
	this.ine = ine;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

}




	
	
	

