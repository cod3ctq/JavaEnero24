package com.msdetventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.msdetventas.service.DetVentasService;
import com.persistence.entity.DetVenta;
import com.persistence.repository.DetVentaRepository;
import com.persistence.request.DetVentaRequest;



public class DetVentasLogic implements DetVentasService {

	@Autowired
	DetVentaRepository det;
	
	
	@Override
	public DetVenta guardar(DetVentaRequest request) {
		
		DetVenta dv = new DetVenta();
		
		
		dv.setDetVentaId(request.getDetVentaId());
		dv.setVentaId(request.getVentaId());
		dv.setProductoId(request.getProductoId());
		dv.setCantidad(request.getCantidad());
		det.save(dv);//Guarda los datos
		return dv;
	}

	@Override
	public DetVenta actualizar(DetVentaRequest request) {
		
		DetVenta dv = det.findById(request.getDetVentaId()).get();
		dv.setDetVentaId(request.getDetVentaId());
		dv.setVentaId(request.getVentaId());
		dv.setProductoId(request.getProductoId());
		dv.setCantidad(request.getCantidad());
		det.save(dv);//Guarda los datos
		return dv;
	}

	@Override
	public DetVenta buscar(int id) {
		// TODO Auto-generated method stub
		return det.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		det.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return det.findAll();
	}

	

}
