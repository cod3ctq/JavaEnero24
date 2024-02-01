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

import com.msempleados.impl.EmpleadosLogic;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadoRequest;




public class EmpleadosController {
	
	@RestController
	@RequestMapping ("empleados/")
	public class ClienteController {
		
		@Autowired
		EmpleadosLogic service;
		
		//http://localhost:8085/clientes/
		@GetMapping
		public ResponseEntity<List<Empleados>> mostar(){
			List <Empleados> lista = service.mostrar();
			return new ResponseEntity <List<Empleados>>(lista,HttpStatus.OK);
		}
		
		//http://localhost:8085/clientes/
		@PostMapping
		public ResponseEntity<Empleados> guardar(@RequestBody EmpleadoRequest request){
			Empleados e = service.guardar(request);
			return new ResponseEntity <Empleados>(e,HttpStatus.OK);
		}
		
		//http://localhost:8085/clientes/
		@PutMapping
		public ResponseEntity<Empleados> actualizar(@RequestBody EmpleadoRequest request){
			Empleados e = service.actualizar(request);
			return new ResponseEntity <Empleados>(e,HttpStatus.OK);
		}
		
		//http://localhost:8085/clientes/buscar/21 
		@GetMapping("buscar/{id}")
		public ResponseEntity<Empleados> buscar(@PathVariable int id){
			Empleados e = service.buscar(id);
			return new ResponseEntity <Empleados>(e,HttpStatus.OK);	
		}
		
		//http://localhost:8085/clientes/eliminar/21
		@DeleteMapping("eliminar/{id}")
		public ResponseEntity<String> eliminar(@PathVariable int id){
			String m = service.eliminar(id);
			return new ResponseEntity <String>(m,HttpStatus.OK);
			
			
		}
		

}
