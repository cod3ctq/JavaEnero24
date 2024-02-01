package com.msdetventa.controller;

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

import com.msdetventa.impl.DetVentaLogic;
import com.persistence.entity.DetalleVenta;
import com.persistence.request.DetalleVentaRequest;

@RestController
@RequestMapping("detVenta/")
public class DetVentaController {

	@Autowired
	DetVentaLogic service;
	
	//http://localhost:8085/empleados/
		// dependiendo del verbo http te arroja un metodo diferente
		@GetMapping
		public ResponseEntity<List<DetalleVenta>> mostrar(){
			List<DetalleVenta> lista = service.mostrar();
			return new ResponseEntity<List<DetalleVenta>>(lista, HttpStatus.OK);			
		}
		//http://localhost:8085/empleados/
		@PostMapping
		public ResponseEntity<DetalleVenta> guardar(@RequestBody DetalleVentaRequest request){
			DetalleVenta c = service.guardar(request);
			return new ResponseEntity<DetalleVenta>(c, HttpStatus.OK);			
		}
		//http://localhost:8085/empleados/
		@PutMapping
		public ResponseEntity<DetalleVenta> actualizar(@RequestBody DetalleVentaRequest request){
			DetalleVenta c = service.actualizar(request);
			return new ResponseEntity<DetalleVenta>(c, HttpStatus.OK);			
		}
		//http://localhost:8085/empleados/buscar/21
		@GetMapping("buscar/{id}")
		public ResponseEntity<DetalleVenta> buscar(@PathVariable("id")int id){
			DetalleVenta c = service.buscar(id);
			return new ResponseEntity<DetalleVenta>(c, HttpStatus.OK);			
		}
		//http://localhost:8085/empleados/eliminar/21
		@DeleteMapping("eliminar/{id}")
		public ResponseEntity<String> eliminar(@PathVariable("id") int id){
			String m = service.eliminar(id);
			return new ResponseEntity<String>(m, HttpStatus.OK);			
		}
	
}
