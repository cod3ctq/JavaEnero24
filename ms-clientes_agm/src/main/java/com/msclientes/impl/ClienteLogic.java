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

	@Autowired //sirve para inyectar el objeto
	//inyeccion de dependencias
	//tipos de inyeccion de dependencias: 
	//por atributo autowired (de springboot), por constructor y por setters
	
	ClienteRepository clienterep;
	
	@Override
	public Clientes guardar(ClienteRequest request) {
		
		Clientes cli= new Clientes();
		cli.setNombre(request.getNombre());
		cli.setDireccion(request.getDireccion());
		cli.setFechaNac(request.getFechaNac());
		
	clienterep.save(cli); //guarda los datos
	
		
		// TODO Auto-generated method stub
		return cli;
	}

	@Override
	public Clientes actualizar(ClienteRequest request) {
		// TODO Auto-generated method stub
	
		Clientes cli = clienterep.findById(request.getClienteId()).get();
	
		cli.setNombre(request.getNombre());
		cli.setDireccion(request.getDireccion());
		cli.setFechaNac(request.getFechaNac());
		
		clienterep.save(cli); //guarda los datos

		
		return cli;
	}

	

	@Override
	public Clientes buscar(int id) {
		
		return clienterep.findById(id).get();
		
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		clienterep.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		
		return clienterep.findAll();
	}

}
