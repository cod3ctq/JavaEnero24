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

 @Entity
 @Table(name="CUSTOMERS")

public class Clientes {
	 
	 public Clientes() {}
	 public Clientes (int id) {
		 this.clienteId = id;
	 }
	
	//No necesita los constructores
	
	
	@Id
	/*@GenerateValue(strategy=GenerationType.SEQUENCE, generator= "cid_auto")*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*@sequenceGenerator(name = "cid_auto", sequenceName = "CLIENTE_SEQ")*/

	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	private  LocalDate fechaNac;
	@Column(name="DOMICILIO", columnDefinition="NVARCHAR2(40)")
	private String domicilio;
	
	
	@OneToMany(mappedBy="cliente")
	private List<Ventas> ventas;
	
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
