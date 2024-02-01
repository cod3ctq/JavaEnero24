package com.msventas.controller;

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

import com.msventas.impl.VentasLogic;
import com.persistence.entity.Ventas;
import com.persistence.request.VentasRequest;

@RestController
@RequestMapping("ventas/")
public class VentasController {

	@Autowired
	VentasLogic service;
	//http://localhost:8086/ventas/
	@GetMapping
	public ResponseEntity<List<Ventas>> mostrar(){
		List<Ventas> lista = service.mostrar();
		return new ResponseEntity<List<Ventas>>(lista, HttpStatus.OK);
	}

	//http://localhost:8086/ventas/
	@PostMapping
	public ResponseEntity<Ventas> guardar(@RequestBody VentasRequest request){
		Ventas vent = service.guardar(request);
		return new ResponseEntity<Ventas>(vent, HttpStatus.OK);
	}
	
	//http://localhost:8086/ventas/
	@PutMapping
	public ResponseEntity<Ventas> actualizar(@RequestBody VentasRequest request){
		Ventas vent = service.actualizar(request);
		return new ResponseEntity<Ventas>(vent, HttpStatus.OK);
	}
	
	//http://localhost:8086/ventas/buscar/21
	@GetMapping("buscar/{id}")
	public ResponseEntity<Ventas> buscar(@PathVariable int id){
		Ventas vent = service.buscar(id);
		return new ResponseEntity<Ventas>(vent, HttpStatus.OK);
	}
	
	//http://localhost:8086/ventas/eliminar/21
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String vc = service.eliminar(id);
		return new ResponseEntity<String>(vc, HttpStatus.OK);
	}

}
