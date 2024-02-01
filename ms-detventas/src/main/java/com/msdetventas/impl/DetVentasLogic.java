package com.msdetventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msdetventas.service.DetVentasService;
import com.persistence.entity.DetVentas;
import com.persistence.repository.DetVentasRepository;
import com.persistence.request.DetVentasRequest;

@Service
public class DetVentasLogic implements DetVentasService{

	@Autowired
	DetVentasRepository logan;
	
	@Override
	public DetVentas guardar(DetVentasRequest request) {
		DetVentas dv = new DetVentas();
		dv.setCantidad(request.getCantidad());
		dv.setProductoId(request.getProductoId());
		dv.setVentaId(request.getVentaId());
		logan.save(dv);
		return dv;
	}

	@Override
	public DetVentas actualizar(DetVentasRequest request) {
		DetVentas dv = logan.findById(request.getDetVentaId()).get();
		dv.setCantidad(request.getCantidad());
		dv.setProductoId(request.getProductoId());
		dv.setVentaId(request.getVentaId());
		return dv;
	}

	@Override
	public DetVentas buscar(int id) {
		// TODO Auto-generated method stub
		return logan.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		logan.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return logan.findAll();
	}

}
