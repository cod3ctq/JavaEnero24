package com.msempleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msempleados.impl.EmpleadoLogic;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadosRequest;

@RestController
@RequestMapping("empleados/")
public class EmpleadosController {

	@Autowired
	EmpleadoLogic service;
	//http://localhost:8085/empleados/
	@GetMapping
	public ResponseEntity<List<Empleados>> mostrar(){
		List<Empleados> lista = service.mostrar();
		return new ResponseEntity<List<Empleados>>(lista, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Empleados> guardar(@RequestBody EmpleadosRequest request){
		Empleados l = service.guardar(request);
		return new ResponseEntity<Empleados>(l, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Empleados> actuaizar(@RequestBody EmpleadosRequest request){
		Empleados l = service.guardar(request);
		return new ResponseEntity<Empleados>(l, HttpStatus.OK);
	}
	
	@GetMapping("buscar/{id}")
	public ResponseEntity<Empleados> buscar(@PathVariable  int id){
		Empleados l = service.buscar(id);
		return new ResponseEntity<Empleados>(l, HttpStatus.OK);
	}
	
	@GetMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable  int id){
		String m = service.eliminar(id);
		return new ResponseEntity<String>(m, HttpStatus.OK);
	}
	
	
	
}
