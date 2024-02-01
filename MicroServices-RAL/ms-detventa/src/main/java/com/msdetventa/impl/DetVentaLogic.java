package com.msdetventa.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.msdetventa.service.DetVentaService;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetalleVenta;
import com.persistence.repository.DetalleVentaRepository;
import com.persistence.request.DetalleVentaRequest;
@Service

public class DetVentaLogic implements DetVentaService {
	


		@Autowired
		DetalleVentaRepository objeto;

		@Override
		public DetalleVenta guardar(DetalleVentaRequest request) {
			DetalleVenta det  = new DetalleVenta();
			det.setCantidad(request.getCantidad());
			
			///pidos
			objeto.save(det); //guarda los datos
			return det;
		
		}

		@Override
		public DetalleVenta actualizar(DetalleVentaRequest request) {
			DetalleVenta det  = new DetalleVenta();
			det.setCantidad(request.getCantidad());
			///pidos
			objeto.save(det); //guarda los datos
			return det;
			
		}

		@Override
		public DetalleVenta buscar(int id) {
			return objeto.findById(id).get();
		}

		@Override
		public String eliminar(int id) {
			objeto.deleteById(id);
			return "Elminao";
		}

		@Override
		public List mostrar() {
			return objeto.findAll();
		}
		
		
}
