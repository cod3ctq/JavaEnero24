package com.msdetalleventa.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msdetalleventa.service.DetalleVentaService;
import com.persistence.entity.DetalleVenta;
import com.persistence.repository.DetalleVentaRepository;
import com.persistence.request.DetalleVentaRequest;

@Service
public class DetalleVentaLogic implements DetalleVentaService {

	@Autowired
	DetalleVentaRepository objeto;

	@Override
	public DetalleVenta guardar(DetalleVentaRequest request) {
		
		DetalleVenta dv = new DetalleVenta();
		dv.setVentaIdFk(request.getVentaIdFk());
		dv.setProductoIdFK(request.getProductoIdFK());
		dv.setCantidad(request.getCantidad());
		
		objeto.save(dv);
		return dv;
	}

	@Override
	public DetalleVenta actualizar(DetalleVentaRequest request) {
		
		DetalleVenta dv = objeto.findById(request.getDetalleVentaId()).get();
		dv.setVentaIdFk(request.getVentaIdFk());
		dv.setProductoIdFK(request.getProductoIdFK());
		dv.setCantidad(request.getCantidad());
		
		objeto.save(dv);
		return dv;
	}

	@Override
	public DetalleVenta buscar(int id) {
		return objeto.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		objeto.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		return objeto.findAll();
	}
	
	
	
}
