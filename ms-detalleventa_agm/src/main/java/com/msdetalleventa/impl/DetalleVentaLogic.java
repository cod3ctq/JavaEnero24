package com.msdetalleventa.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msdetalleventa.service.DetalleVentaService;
import com.persistence.entity.DetalleVenta;
import com.persistence.repository.DetalleVentaRepository;
import com.persistence.request.DetalleVentaRequest;


@Service
public class DetalleVentaLogic implements DetalleVentaService{
	



		@Autowired //sirve para inyectar el objeto
		//inyeccion de dependencias
		//tipos de inyeccion de dependencias: 
		//por atributo autowired (de springboot), por constructor y por setters
		
		DetalleVentaRepository detallerep;
		
		@Override
		public DetalleVenta guardar(DetalleVentaRequest request) {
			
			DetalleVenta detv= new DetalleVenta();
			detv.setVentaId(request.getVentaId());
			detv.setProductoId(request.getProductoId());
			detv.setCantidad(request.getCantidad());
			
			detallerep.save(detv); //guarda los datos
		
			return detv;
		}

		@Override
		public DetalleVenta actualizar(DetalleVentaRequest request) {
			// TODO Auto-generated method stub
		
			DetalleVenta detv = detallerep.findById(request.getDetVentaId()).get();
		
			detv.setVentaId(request.getVentaId());
			detv.setProductoId(request.getProductoId());
			detv.setCantidad(request.getCantidad());
			
			detallerep.save(detv); //guarda los datos
			
			return detv;
			
		}

		

		@Override
		public DetalleVenta buscar(int id) {
			
			return detallerep.findById(id).get();
			
		}

		@Override
		public String eliminar(int id) {
			// TODO Auto-generated method stub
			detallerep.deleteById(id);
			return "Eliminado";
		}

		@Override
		public List mostrar() {
			
			return detallerep.findAll();
		}

	}

