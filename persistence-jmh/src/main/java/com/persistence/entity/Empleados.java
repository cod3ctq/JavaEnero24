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
@Table(name="EMPLEADOS")
public class Empleados {
	
	//No necesita los constructores
	
	@Id
	/*@GenerateValue(strategy=GenerationType.SEQUENCE, generator= "cid_auto")*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*@sequenceGenerator(name = "cid_auto", sequenceName = "CLIENTE_SEQ")*/



	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="FECHA_INGRESO", columnDefinition="DATE")
	private LocalDate fecha;
	@Column(name="SALARIO", columnDefinition="NUMBER")
	private int salario;
	
	@OneToMany (mappedBy="empleado")
	private List<Ventas> ventas;
	
	public Empleados () {}
	
	public Empleados(int empleadoId, String nombre, LocalDate fecha, int salario) {
		super();
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fecha = fecha;
		this.salario = salario;
	}





	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	

	
	
	


	
	
	
	


}
