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

import com.msproductos.impl.ProductoLogic;
import com.persistence.entity.Productos;
import com.persistence.request.ProductoRequest;

@RestController
@RequestMapping("productos/")
public class ProductoController {
	
	@Autowired
	ProductoLogic service;
	
	//http://localhost:8089/productos/
	@GetMapping
	public ResponseEntity<List<Productos>> mostrar(){
		List<Productos> lista = service.mostrar();
		return new ResponseEntity<List<Productos>>(lista, HttpStatus.OK);            
	}
	
	@PostMapping
	public ResponseEntity<Productos> guardar(@RequestBody ProductoRequest request){
		Productos c = service.guardar(request);
		return new ResponseEntity<Productos>(c, HttpStatus.OK);            
	}
	
	@PutMapping
	public ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest request){
		Productos c = service.actualizar(request);
		return new ResponseEntity<Productos>(c, HttpStatus.OK);            
	}
	
	@GetMapping("buscar/{id}")
	public ResponseEntity<Productos> buscar(@PathVariable int id){
		Productos c = service.buscar(id);
		return new ResponseEntity<Productos>(c, HttpStatus.OK);            
	}
	
	@GetMapping("buscar-id/{nombre}")
	public ResponseEntity<Integer> buscarIdSiExiste(@PathVariable String nombre){
		Integer c = service.getIdProductoIfExist(nombre);
		return new ResponseEntity<Integer>(c, HttpStatus.OK);            
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String m = service.eliminar(id);
		return new ResponseEntity<String>(m, HttpStatus.OK);            
	}
		

}
