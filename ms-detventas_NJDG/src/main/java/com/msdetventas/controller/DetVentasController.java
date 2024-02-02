package com.msdetventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msdetventas.impl.DetVentasLogic;
import com.persistence.entity.DetalleVentas;
import com.persistence.request.DetalleVentasRequest;


@RestController
@RequestMapping("detventas/")
public class DetVentasController {
	
	@Autowired
	DetVentasLogic service;
	@GetMapping
	public ResponseEntity<List<DetalleVentas>> mostrar(){
		List<DetalleVentas> lista = service.mostrar();
		return new ResponseEntity<List<DetalleVentas>>(lista, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<DetalleVentas> guardar(@RequestBody DetalleVentasRequest request){
		DetalleVentas l = service.guardar(request);
		return new ResponseEntity<DetalleVentas>(l, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<DetalleVentas> actuaizar(@RequestBody DetalleVentasRequest request){
		DetalleVentas l = service.guardar(request);
		return new ResponseEntity<DetalleVentas>(l, HttpStatus.OK);
	}
	
	@GetMapping("buscar/{id}")
	public ResponseEntity<DetalleVentas> buscar(@PathVariable  int id){
		DetalleVentas l = service.buscar(id);
		return new ResponseEntity<DetalleVentas>(l, HttpStatus.OK);
	}
	
	@GetMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable  int id){
		String m = service.eliminar(id);
		return new ResponseEntity<String>(m, HttpStatus.OK);
	}

}
