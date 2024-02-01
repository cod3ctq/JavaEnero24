package com.msdetventa.service;

import java.util.List;

import com.persistence.entity.DetalleVenta;
import com.persistence.request.DetalleVentaRequest;

public interface DetVentaService {

	
	DetalleVenta guardar (DetalleVentaRequest request);
	DetalleVenta actualizar (DetalleVentaRequest request);
	DetalleVenta buscar (int id);
	String eliminar (int id);
	List mostrar ();
	
	
}
