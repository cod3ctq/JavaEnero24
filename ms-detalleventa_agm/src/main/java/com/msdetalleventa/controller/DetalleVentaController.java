package com.msdetalleventa.controller;

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

import com.msdetalleventa.impl.DetalleVentaLogic;
import com.persistence.entity.DetalleVenta;
import com.persistence.request.ClienteRequest;
import com.persistence.request.DetalleVentaRequest;


@RestController
@RequestMapping("detalleventa/")
public class DetalleVentaController {


	@Autowired
	DetalleVentaLogic service;
	
	
	//http://localhost:8088/detalleventa/
	@GetMapping
public ResponseEntity<List<DetalleVenta>> mostrar(){
		List<DetalleVenta> lista= service.mostrar();
		return new ResponseEntity<List<DetalleVenta>>(lista, HttpStatus.OK);
		
	}
	//http://localhost:8088/detalleventa/
	@PostMapping
	public ResponseEntity<DetalleVenta> guardar(@RequestBody DetalleVentaRequest request){
		DetalleVenta det = service.guardar(request);
		return new ResponseEntity<DetalleVenta>(det, HttpStatus.OK);
		
	}
	//http://localhost:8088/detalleventa/
	@PutMapping
	public ResponseEntity<DetalleVenta> actualizar(@RequestBody DetalleVentaRequest request){
		DetalleVenta det = service.actualizar(request);
		return new ResponseEntity<DetalleVenta>(det, HttpStatus.OK);
		
	}
	//http://localhost:8088/detalleventa/
	@GetMapping("buscar/{id}")
	public ResponseEntity<DetalleVenta> buscar(@PathVariable ("id") int id){
		DetalleVenta det = service.buscar(id);
		return new ResponseEntity<DetalleVenta>(det, HttpStatus.OK);
		
	}
	//http://localhost:8088/detalleventa/
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable ("id")int id){
		String det = service.eliminar(id);
		return new ResponseEntity<String>(det, HttpStatus.OK);
	}

}


