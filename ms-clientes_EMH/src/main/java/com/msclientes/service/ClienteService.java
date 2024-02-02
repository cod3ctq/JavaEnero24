package com.msclientes.service;

import java.util.List;

import com.persistence.entity.Clientes;
import com.persistence.request.ClienteRequest;


//Interface de negocio
//Crea el contrato de acciones o responsabilidades de las que este micro se hace cargo
public interface ClienteService {

	Clientes guardar(ClienteRequest request);
	Clientes actualizar(ClienteRequest request);
	Clientes buscar(int id);
	String eliminar(int id);
	List mostrar();
	
}
