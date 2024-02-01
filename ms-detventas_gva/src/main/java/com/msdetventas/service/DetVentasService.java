package com.msdetventas.service;

import java.util.List;

import com.persistence.entity.DetVentas;
import com.persistence.request.DetVentasRequest;

public interface DetVentasService {


	DetVentas guardar(DetVentasRequest request);
	DetVentas actualizar(DetVentasRequest request);
	DetVentas buscar(int id);
	String eliminar(int id);
	List mostrar();
}
