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

	
	//no necesita los constructores
			
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			
			@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
			int empleadoId;
			@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
			String nombre;
			@Column(name="FECHA_INGRESO", columnDefinition="DATE")//DATE POR ORACLE
			LocalDate fechaingre;//LOCAL DATE POR JAVA
			@Column(name="SALARIO", columnDefinition="NUMBER")
			String salario;
			
			@OneToMany(mappedBy="empleadoId")
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

			public LocalDate getFechaingre() {
				return fechaingre;
			}

			public void setFechaingre(LocalDate fechaingre) {
				this.fechaingre = fechaingre;
			}

			public String getSalario() {
				return salario;
			}

			public void setSalario(String salario) {
				this.salario = salario;
			}
			


	
}
