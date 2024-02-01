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

	@Autowired
	EmpleadosRepository lobezno;
	
	@Override
	public Empleados guardar(EmpleadosRequest request) {
		Empleados e = new Empleados();
		e.setFechaIngreso(request.getFechaIngreso());
		e.setNombre(request.getNombre());
		e.setSalario(request.getSalario());
		lobezno.save(e);
		return e;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {
		
		Empleados e = lobezno.findById(request.getEmpleadoId()).get();
		e.setFechaIngreso(request.getFechaIngreso());
		e.setNombre(request.getNombre());
		e.setSalario(request.getSalario());
		lobezno.save(e);
		return e;
	}

	@Override
	public Empleados buscar(int id) {
		// TODO Auto-generated method stub
		return lobezno.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		lobezno.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return lobezno.findAll();
	}

}
