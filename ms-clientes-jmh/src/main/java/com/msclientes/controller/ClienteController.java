package com.msclientes.controller;

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

import com.msclientes.impl.ClienteLogic;
import com.persistence.entity.Clientes;
import com.persistence.request.ClienteRequest;

@RestController
@RequestMapping ("clientes/")
public class ClienteController {
	
	@Autowired
	ClienteLogic service;
	
	//http://localhost:8085/clientes/
	@GetMapping
	public ResponseEntity<List<Clientes>> mostar(){
		List <Clientes> lista = service.mostrar();
		return new ResponseEntity <List<Clientes>>(lista,HttpStatus.OK);
	}
	
	//http://localhost:8085/clientes/
	@PostMapping
	public ResponseEntity<Clientes> guardar(@RequestBody ClienteRequest request){
		Clientes c = service.guardar(request);
		return new ResponseEntity <Clientes>(c,HttpStatus.OK);
	}
	
	//http://localhost:8085/clientes/
	@PutMapping
	public ResponseEntity<Clientes> actualizar(@RequestBody ClienteRequest request){
		Clientes c = service.actualizar(request);
		return new ResponseEntity <Clientes>(c,HttpStatus.OK);
	}
	
	//http://localhost:8085/clientes/buscar/21 
	@GetMapping("buscar/{id}")
	public ResponseEntity<Clientes> buscar(@PathVariable int id){
		Clientes c = service.buscar(id);
		return new ResponseEntity <Clientes>(c,HttpStatus.OK);	
	}
	
	//http://localhost:8085/clientes/eliminar/21
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String m = service.eliminar(id);
		return new ResponseEntity <String>(m,HttpStatus.OK);
		
		
	}
	
}
