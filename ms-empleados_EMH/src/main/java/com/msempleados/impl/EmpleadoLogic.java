package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadoService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.EmpleadoRequest;

@Service
public class EmpleadoLogic implements EmpleadoService{

	@Autowired
	EmpleadoRepository objeto;

	@Override
	public Empleados guardar(EmpleadoRequest request) {
		
		Empleados emp = new Empleados();
		emp.setNombre(request.getNombre());
		emp.setFechaIngreso(request.getFechaIngreso());
		emp.setSalario(request.getSalario());
		
		objeto.save(emp);
		return emp;
	}

	@Override
	public Empleados actualizar(EmpleadoRequest request) {
		Empleados emp = objeto.findById(request.getEmpleadoId()).get();
		emp.setNombre(request.getNombre());
		emp.setFechaIngreso(request.getFechaIngreso());
		emp.setSalario(request.getSalario());
		
		objeto.save(emp);
		return emp;
	}

	@Override
	public Empleados buscar(int id) {
		return objeto.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		objeto.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		return objeto.findAll();
	}
	
	
}
