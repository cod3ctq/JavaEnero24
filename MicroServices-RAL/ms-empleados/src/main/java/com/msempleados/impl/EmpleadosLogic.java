package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadoService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.request.EmpleadoRequest;


@Service
public class EmpleadosLogic implements EmpleadoService {

	@Autowired
	EmpleadosRepository objeto;
	
	
	@Override
	public Empleados guardar(EmpleadoRequest request) {
		Empleados emp  = new Empleados();
		emp.setNombre(request.getNombre());
		emp.setFechaIng(request.getFechaIng());
		emp.setSalario(request.getSalario());
		objeto.save(emp); //guarda los datos
		return emp;
	}

	@Override
	public Empleados actualizar(EmpleadoRequest request) {
		Empleados emp  = objeto.findById(request.getEmpleadoId()).get();
		emp.setNombre(request.getNombre());
		emp.setFechaIng(request.getFechaIng());
		emp.setSalario(request.getSalario());
		objeto.save(emp); //guarda los datos
		return emp;	
	}

	@Override
	public Empleados buscar(int id) {
		return objeto.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		objeto.deleteById(id);
		return "Elminao";
	}

	@Override
	public List mostrar() {
		return objeto.findAll();
	}

}
