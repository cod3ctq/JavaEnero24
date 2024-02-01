package com.msdetventas.controller;

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

import com.msdetventas.impl.DetVentasLogic;
import com.persistence.entity.DetVentas;
import com.persistence.request.DetVentasRequest;




@RestController
@RequestMapping("detventas/")
public class DetVentasController {
	@Autowired
	DetVentasLogic service;
	
	//http://localhost:8088/detventas/	
	@GetMapping
	public ResponseEntity<List<DetVentas>> mostrar(){
		List<DetVentas> lista = service.mostrar();
		return new ResponseEntity<List<DetVentas>>(lista, HttpStatus.OK);
	}

	//http://localhost:8088/detventas/
	@PostMapping
	public ResponseEntity<DetVentas> guardar(@RequestBody DetVentasRequest request){
		DetVentas dv = service.guardar(request);
		return new ResponseEntity<DetVentas>(dv, HttpStatus.OK);
	}
	
	//http://localhost:8088/detventas/
	@PutMapping
	public ResponseEntity<DetVentas> actualizar(@RequestBody DetVentasRequest request){
		DetVentas dv = service.actualizar(request);
		return new ResponseEntity<DetVentas>(dv, HttpStatus.OK);
	}
	
	//http://localhost:8088/detventas/buscar/21
	@GetMapping("buscar/{id}")
	public ResponseEntity<DetVentas> buscar(@PathVariable int id){
		DetVentas dv = service.buscar(id);
		return new ResponseEntity<DetVentas>(dv, HttpStatus.OK);
	}
	
	//http://localhost:8088/detventas/eliminar/21
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String dvs = service.eliminar(id);
		return new ResponseEntity<String>(dvs, HttpStatus.OK);
	}
}
