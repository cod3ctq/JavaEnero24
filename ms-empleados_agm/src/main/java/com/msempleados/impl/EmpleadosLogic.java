package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadosService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.request.EmpleadosRequest;

@Service

public class EmpleadosLogic implements EmpleadosService{
	//se genera automaticamente los metodos con la dependencia de otra clase

	@Autowired
	EmpleadosRepository empleadosrep;
	
	@Override
	public Empleados guardar(EmpleadosRequest request) {
		Empleados emp =new Empleados();
		emp.setNombre(request.getNombre());
		emp.setFechaingre(request.getFechaIngreso());
		emp.setSalario(request.getSalario());
		
		empleadosrep.save(emp);
		return emp;
		
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {
		
		Empleados emp = empleadosrep.findById(request.getEmpleadoId()).get();
		
		emp.setNombre(request.getNombre());
		emp.setFechaingre(request.getFechaIngreso());
		emp.setSalario(request.getSalario());
		
		empleadosrep.save(emp);
		return emp;
		
	}

	@Override
	public Empleados buscar(int id) {
		return empleadosrep.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		empleadosrep.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		
		return empleadosrep.findAll();
	}

	
}
