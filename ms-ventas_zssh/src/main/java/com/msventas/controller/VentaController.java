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

import com.msventas.impl.VentaLogic;
import com.persistence.entity.Ventas;
import com.persistence.request.VentasRequest;



@RestController
@RequestMapping("ventas/")
public class VentaController {
	
	@Autowired
	VentaLogic service;
	//http://localhost:8085/clientes/
	@GetMapping
	public ResponseEntity<List<Ventas>> mostrar() {
		List<Ventas> lista = service.mostrar();
		return new ResponseEntity<List<Ventas>>(lista, HttpStatus.OK);
	}

	// http://localhost:8085/clientes/
	@PostMapping
	public ResponseEntity<Ventas> guardar(@RequestBody VentasRequest request) {
		Ventas v = service.guardar(request);
		return new ResponseEntity<Ventas>(v, HttpStatus.OK);
	}

	// http:localhost:8085/clientes/
	@PutMapping
	public ResponseEntity<Ventas> actualizar(@RequestBody VentasRequest request) {
		Ventas v = service.actualizar(request);
		return new ResponseEntity<Ventas>(v, HttpStatus.OK);
	}

	// http://localhost:8085/clientes/buscar/21
	@GetMapping("buscar/{id}")
	public ResponseEntity<Ventas> buscar(@PathVariable int id) {
		Ventas v = service.buscar(id);
		return new ResponseEntity<Ventas>(v, HttpStatus.OK);
	}

	// http:localhost:8085/ventas/eliminar/1
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id) {
		String m = service.eliminar(id);
		return new ResponseEntity<String>(m, HttpStatus.OK);

	}

}
