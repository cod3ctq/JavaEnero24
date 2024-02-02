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
import com.msproductos.impl.ProductoLogic;
import com.msproductos.request.ProductoRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("productos/")
public class ProductoController {

	 
	@Autowired 
	ProductoLogic service;
	
	//http://localhost:8089/productos/ 
		@GetMapping
		public ResponseEntity<List<Productos>> mostrar() {
			List<Productos> lista = service.mostrar();
			return new ResponseEntity<List<Productos>>(lista, HttpStatus.OK);
		}

		// http://localhost:8089/productos/
		@PostMapping
		public ResponseEntity<Productos> guardar(@Valid @RequestBody ProductoRequest request) {
			Productos pro = service.guardar(request);
			return new ResponseEntity<Productos>(pro, HttpStatus.OK);
		}

		// http:localhost:8089/productos/
		@PutMapping
		public ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest request) {
			Productos pro = service.actualizar(request);
			return new ResponseEntity<Productos>(pro, HttpStatus.OK);
		}

		// http://localhost:8089/productos/buscar/21
		@GetMapping("buscar/{id}")
		public ResponseEntity<Productos> buscar(@PathVariable int id) {
			Productos pro = service.buscar(id);
			return new ResponseEntity<Productos>(pro, HttpStatus.OK);
		}

		// http://localhost:8089/productos/buscar/21
		@GetMapping("buscar/{nombre}")
		public ResponseEntity<Integer> buscar(@PathVariable String nombre) {
				Integer Id = service.getIdProductIfExist(nombre);
				return new ResponseEntity<Integer>(Id, HttpStatus.OK);
		}
	
		// http:localhost:8089/productos/buscar-id/TEQUILA
		@DeleteMapping("eliminar/{id}")
		public ResponseEntity<String> eliminar(@PathVariable int id) {
			String m = service.eliminar(id);
			return new ResponseEntity<String>(m, HttpStatus.OK);

		}

	
}
