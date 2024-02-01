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

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	private LocalDate FechaNa;
	@Column(name="DOMICILIO", columnDefinition="NVARCHAR2(40)")
	private String domicilio;
	
	@OneToMany(mappedBy="clienteId")
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
	

}
