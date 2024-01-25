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


	public Clientes(){}
	
	public Clientes(int id) {
		this.clienteId=id;	
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	int clienteId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	String nombre;
	@Column(name="DIRECCION", columnDefinition="NVARCHAR2(40)")
	String direccion;
	@Column(name="INE", columnDefinition="NVARCHAR2(10)")
	String ine;
	@Column(name="TELEFONO", columnDefinition="NVARCHAR2(10)")
	String telefono;
	//GETTERS & SETTERS
	public Clientes(int clienteId, String nombre, String direccion, String ine, String telefono) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ine = ine;
		this.telefono = telefono;
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

	@Override
	public String toString() {
		return "Clientes [clienteId=" + clienteId + ", nombre=" + nombre + ", direccion=" + direccion + ", ine=" + ine
				+ ", telefono=" + telefono + "]";
	}
	
}