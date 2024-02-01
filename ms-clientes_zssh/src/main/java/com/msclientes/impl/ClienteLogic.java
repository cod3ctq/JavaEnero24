package com.msclientes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclientes.service.ClienteService;
import com.persistence.entity.Clientes;
import com.persistence.repository.ClienteRepository;
import com.persistence.request.ClienteRequest;
@Service
public class ClienteLogic implements ClienteService{
//ocupa lo de repository
	@Autowired
	ClienteRepository clienteR;
	
	@Override
	public Clientes guardar(ClienteRequest request) {
		
		Clientes cli = new Clientes();
		
		cli.setNombre(request.getNombre());
		cli.setDomicilio(request.getDomicilio());
		cli.setFechaNac(request.getFechaNac());
		
		clienteR.save(cli);//guarda los datos
		
		return cli;
	}

	@Override
	public Clientes actualizar(ClienteRequest request) {

		Clientes cli = clienteR.findById(request.getClienteId()).get();
		
		cli.setNombre(request.getNombre());
		cli.setDomicilio(request.getDomicilio());
		cli.setFechaNac(request.getFechaNac());
		
		clienteR.save(cli);//guarda los datos
		
		return cli;
		
	}

	@Override
	public Clientes buscar(int id) {
		
		return clienteR.findById(id).get();
	}

	@Override
	public String eliminar(int id) {

		clienteR.deleteById(id);;
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		
		return clienteR.findAll();
		
	}

}
