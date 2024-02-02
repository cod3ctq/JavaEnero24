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
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	private String nombre;
	@Column(name="FECHA_INGRESO", columnDefinition="DATE")
	private LocalDate fechaIngreso;
	@Column(name="SALARIO", columnDefinition="NUMBER(5,2)")
	private int salario;
	
	@OneToMany(mappedBy = "empleado")
	private List<Ventas> ventas;

	
	
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
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
}
