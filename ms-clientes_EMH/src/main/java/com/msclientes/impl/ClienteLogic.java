package com.msclientes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; //FIJO

import com.msclientes.service.ClienteService;
import com.persistence.entity.Clientes;
import com.persistence.repository.ClienteRepository;
import com.persistence.request.ClienteRequest;

@Service
public class ClienteLogic implements ClienteService{

	@Autowired
	ClienteRepository objeto;
	
	
	@Override
	public Clientes guardar(ClienteRequest request) {
		Clientes cli = new Clientes();
		cli.setNombre(request.getNombre());
		cli.setDomicilio(request.getDomicilio());
		cli.setFechaNa(request.getFechaNa());
		objeto.save(cli); //Guarda los datos
		return cli;
	}

	@Override
	public Clientes actualizar(ClienteRequest request) {
		
		Clientes cli = objeto.findById(request.getClienteId()).get();
		cli.setNombre(request.getNombre());
		cli.setDomicilio(request.getDomicilio());
		cli.setFechaNa(request.getFechaNa());
		objeto.save(cli); //Guarda los datos
		
		return cli;
	}

	@Override
	public Clientes buscar(int id) {
		return objeto.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		objeto.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		return objeto.findAll();
	}
	
	

}
