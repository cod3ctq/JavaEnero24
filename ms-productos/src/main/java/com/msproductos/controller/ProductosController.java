package com.msproductos.controller;

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

import com.msproductos.entity.Productos;
import com.msproductos.impl.ProductosLogic;
import com.msproductos.request.ProductosRequest;



@RestController
@RequestMapping("productos/")
public class ProductosController {

	@Autowired
	ProductosLogic service;

	// http://localhost:8084/productos/
	@GetMapping
	public ResponseEntity<List<Productos>> mostrar() {
		List<Productos> lista = service.mostrar();
		return new ResponseEntity<List<Productos>>(lista, HttpStatus.OK);
	}

	// http://localhost:8084/productos/
	@PostMapping
	public ResponseEntity<Productos> guardar(@RequestBody ProductosRequest request) {
		Productos em = service.guardar(request);
		return new ResponseEntity<Productos>(em, HttpStatus.OK);
	}

	// http://localhost:8084/productos/
	@PutMapping
	public ResponseEntity<Productos> actualizar(@RequestBody ProductosRequest request) {
		Productos em = service.actualizar(request);
		return new ResponseEntity<Productos>(em, HttpStatus.OK);
	}

	// http://localhost:8084/productos/buscar/21
	@GetMapping("buscar/{id}")
	public ResponseEntity<Productos> buscar(@PathVariable int id) {
		Productos em = service.buscar(id);
		return new ResponseEntity<Productos>(em, HttpStatus.OK);
	}
	
	//http://localhost:8084/productos/buscar-id/TEQUILA
	@GetMapping("buscar-id/{nombre}")
	public ResponseEntity<Integer> buscarIdSiExiste(@PathVariable String nombre) {
		Integer id = service.getIdProductIfExist(nombre);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}

	// http://localhost:8084/productos/buscar/21
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id) {
		String ms = service.eliminar(id);
		return new ResponseEntity<String>(ms, HttpStatus.OK);
	}
}
