package com.msclientes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclientes.service.ClienteService;
import com.persistence.entity.Clientes;
import com.persistence.repository.ClienteRepository;
import com.persistence.request.ClienteRequest;
@Service
public class ClienteLogic implements ClienteService {

	@Autowired
	ClienteRepository wolverine;
	
	
	@Override
	public Clientes guardar(ClienteRequest request) {
		Clientes cli = new Clientes();
		cli.setNombre(request.getNombre());
		cli.setDomicilio(request.getDomicilio());
		cli.setFechaNac(request.getFechaNac());
		wolverine.save(cli); //Guarda los datos
		return cli;
	}

	@Override
	public Clientes actualizar(ClienteRequest request) {
		
		Clientes cli = wolverine.findById(request.getClienteId()).get();
		cli.setNombre(request.getNombre());
		cli.setDomicilio(request.getDomicilio());
		cli.setFechaNac(request.getFechaNac());
		wolverine.save(cli); //Guarda los datos
		return cli;
	}

	@Override
	public Clientes buscar(int id) {
		// TODO Auto-generated method stub
		return wolverine.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		wolverine.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return wolverine.findAll();
	}

}
