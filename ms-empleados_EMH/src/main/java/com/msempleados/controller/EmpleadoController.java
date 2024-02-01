package com.msempleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msempleados.impl.EmpleadoLogic;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadoRequest;

@RestController
@RequestMapping("empleados/")
public class EmpleadoController {

	@Autowired
	EmpleadoLogic service;
	
	
	//http://localhost:8087/empleados/
	@GetMapping
	public ResponseEntity<List<Empleados>> mostrar(){
		List<Empleados> lista = service.mostrar();
		return new ResponseEntity<List<Empleados>>(lista, HttpStatus.OK);            
	}
	
	@PostMapping
	public ResponseEntity<Empleados> guardar(@RequestBody EmpleadoRequest request){
		Empleados c = service.guardar(request);
		return new ResponseEntity<Empleados>(c, HttpStatus.OK);            
	}
	
	@PutMapping
	public ResponseEntity<Empleados> actualizar(@RequestBody EmpleadoRequest request){
		Empleados c = service.actualizar(request);
		return new ResponseEntity<Empleados>(c, HttpStatus.OK);            
	}
	
	
	@GetMapping("buscar/{id}")
	public ResponseEntity<Empleados> buscar(@PathVariable int id){
		Empleados c = service.buscar(id);
		return new ResponseEntity<Empleados>(c, HttpStatus.OK);            
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String m = service.eliminar(id);
		return new ResponseEntity<String>(m, HttpStatus.OK);            
	}
	
}
