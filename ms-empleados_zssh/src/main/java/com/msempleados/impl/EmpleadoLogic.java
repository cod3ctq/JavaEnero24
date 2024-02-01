package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadoService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.request.EmpleadosRequest;

@Service
public class EmpleadoLogic implements EmpleadoService {
	@Autowired
	EmpleadosRepository empleado;

	@Override
	public Empleados guardar(EmpleadosRequest request) {

		Empleados emp = new Empleados();
		
		emp.setNombre(request.getNombre());
		emp.setFechaIngreso(request.getFechaIngreso());
		emp.setSalario(request.getSalario());
		
		empleado.save(emp);//guarda los datos
		return emp;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {
		
		Empleados emp = empleado.findById(request.getEmpleadosId()).get();
		emp.setNombre(request.getNombre());
		emp.setFechaIngreso(request.getFechaIngreso());
		emp.setSalario(request.getSalario());
		
		empleado.save(emp);
		
		return emp;
	}

	@Override
	public Empleados buscar(int id) {
		
		return empleado.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		empleado.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {

		return empleado.findAll();
	}

}
