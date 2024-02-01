package com.msdetventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msdetventas.service.DetVentasService;
import com.persistence.entity.DetalleVentas;
import com.persistence.repository.DetalleVentasRepository;
import com.persistence.request.DetalleVentasRequest;

@Service
public class DetVentasLogic implements DetVentasService{

	@Autowired
	DetalleVentasRepository detVenta;
	
	@Override
	public DetalleVentas guardar(DetalleVentasRequest request) {
		
		DetalleVentas det = new DetalleVentas();
		
		det.setDetVentaId(request.getDetVentaId());
		det.setVentaId(request.getVentaId());
		det.setProductoId(request.getProductoId());
		det.setCantidad(request.getCantidad());
		
		detVenta.save(det);//guarda los datos
		return det;
	}

	@Override
	public DetalleVentas actualizar(DetalleVentasRequest request) {
		DetalleVentas det = detVenta.findById(request.getDetVentaId()).get();
		
		det.setCantidad(request.getCantidad());
		
		detVenta.save(det);//guarda los datos
		return null;
	}

	@Override
	public DetalleVentas buscar(int id) {
		
		return detVenta.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		detVenta.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

}
