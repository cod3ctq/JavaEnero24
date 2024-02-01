package com.msdetventas.service;

import java.util.List;

import com.persistence.entity.DetalleVentas;
import com.persistence.request.DetalleVentasRequest;


public interface DetVentasService {

	DetalleVentas guardar(DetalleVentasRequest request);
	DetalleVentas actualizar(DetalleVentasRequest request);
	DetalleVentas buscar ( int id);
	String eliminar(int id);
	List mostrar();
}
