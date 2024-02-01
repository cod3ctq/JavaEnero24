package com.msdetventas.service;

import java.util.List;

import com.persistence.entity.DetVenta;
import com.persistence.request.DetVentaRequest;



public interface DetVentasService {
	
	DetVenta guardar (DetVentaRequest request);
	DetVenta actualizar (DetVentaRequest request);
	DetVenta buscar (int id);
	String eliminar (int id);
	List mostrar ();

}
