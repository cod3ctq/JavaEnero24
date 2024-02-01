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
import com.persistence.entity.DetVenta;
import com.persistence.request.DetVentaRequest;



@RestController
@RequestMapping ("detventas/")

public class DetVentasController {
	
	@Autowired
	DetVentasLogic service;
	
	//http://localhost:8085/clientes/
	@GetMapping
	public ResponseEntity<List<DetVenta>> mostar(){
		List <DetVenta> lista = service.mostrar();
		return new ResponseEntity <List<DetVenta>>(lista,HttpStatus.OK);
	}
	
	//http://localhost:8085/clientes/
	@PostMapping
	public ResponseEntity<DetVenta> guardar(@RequestBody DetVentaRequest request){
		DetVenta dv = service.guardar(request);
		return new ResponseEntity <DetVenta>(dv,HttpStatus.OK);
	}
	
	//http://localhost:8085/clientes/
	@PutMapping
	public ResponseEntity<DetVenta> actualizar(@RequestBody DetVentaRequest request){
		DetVenta dv = service.actualizar(request);
		return new ResponseEntity <DetVenta>(dv,HttpStatus.OK);
	}
	
	//http://localhost:8085/clientes/buscar/21 
	@GetMapping("buscar/{id}")
	public ResponseEntity<DetVenta> buscar(@PathVariable int id){
		DetVenta c = service.buscar(id);
		return new ResponseEntity <DetVenta>(c,HttpStatus.OK);	
	}
	
	//http://localhost:8085/clientes/eliminar/21
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String m = service.eliminar(id);
		return new ResponseEntity <String>(m,HttpStatus.OK);
		
		
	}
	
	
	

}
