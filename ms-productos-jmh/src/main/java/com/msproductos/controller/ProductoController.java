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


@RestController
@RequestMapping("items/")
public class ProductoController {
	
	@Autowired
	ProductoLogic service;
	
	//http://localhost:8084/clientes/
	@GetMapping
	public ResponseEntity<List<Productos>> mostar(){
		List <Productos> lista = service.mostrar();
		return new ResponseEntity <List<Productos>>(lista,HttpStatus.OK);
	}
	
	//http://localhost:8084/clientes/
	@PostMapping
	public ResponseEntity<Productos> guardar(@RequestBody ProductoRequest request){
		Productos p = service.guardar(request);
		return new ResponseEntity <Productos>(p,HttpStatus.OK);
	}
	
	//http://localhost:8084/clientes/
	@PutMapping
	public ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest request){
		Productos p = service.actualizar(request);
		return new ResponseEntity <Productos>(p,HttpStatus.OK);
	}
	
	//http://localhost:8084/clientes/buscar/21 
	@GetMapping("buscar/{id}")
	public ResponseEntity<Productos> buscar(@PathVariable int id){
		Productos p = service.buscar(id);
		return new ResponseEntity <Productos>(p,HttpStatus.OK);	
	}
	
	@GetMapping("buscar-por-nombre/{nombre}")
	public ResponseEntity<Integer> buscarIdExiste(@PathVariable String nombre){
		Integer id = service.getProductIfExist(nombre);
		return new ResponseEntity<Integer>(id,HttpStatus.OK);	
	}
	
	//http://localhost:8084/productos/buscar-id/TEQUILA
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String r = service.eliminar(id);
		return new ResponseEntity <String>(r,HttpStatus.OK);
		
		
	}

}
