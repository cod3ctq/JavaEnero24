package com.msempleados.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadosService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.EmpleadoRequest;



@Service
public class EmpleadosLogic implements EmpleadosService  {
	
	@Autowired
	EmpleadoRepository emple;
	
	@Override
	public Empleados guardar(EmpleadoRequest request) {
		
		Empleados emp = new Empleados ();
		
		
		emp.setEmpleadoId(request.getEmpleadoId());
		emp.setFecha(request.getFecha());
		emp.setNombre(request.getNombre());
		emp.setSalario(request.getSalario());

		
		emple.save(emp);//Guarda los datos
		return emp;
	}

	@Override
	public Empleados actualizar(EmpleadoRequest request) {
		
		Empleados emp = emple.findById(request.getEmpleadoId()).get();
		emp.setEmpleadoId(request.getEmpleadoId());
		emp.setFecha(request.getFecha());
		emp.setNombre(request.getNombre());
		emp.setSalario(request.getSalario());
		emple.save(emp);//Guarda los datos
		return emp;
	}

	@Override
	public Empleados buscar(int id) {
		// TODO Auto-generated method stub
		return emple.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		emple.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return emple.findAll();
	}


}
