package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.repository.ProductosRepository;
import com.msproductos.request.ProductosRequest;
import com.msproductos.service.ProductosService;

@Service
public class ProductosLogic implements ProductosService {

	@Autowired
	ProductosRepository productorep; //para que de un producto retorne el id doble click t ctrl
	//nos vamos a productos repository
	
	
	@Override
	public Productos guardar(ProductosRequest request) {
		
		Productos prod=new Productos();
		prod.setDeptoId(request.getDeptoId());
		prod.setNombre(request.getNombre());
		prod.setFechaCad(request.getFechaCad());
		prod.setPrecioCompra(request.getPrecioCompra());
		prod.setPrecioVenta(request.getPrecioVenta());
		prod.setRefrigerado(request.getRefrigerado());

		
		productorep.save(prod);//guardar
	return prod;	
	}

	@Override
	public Productos actualizar(ProductosRequest request) {


		Productos prod=productorep.findById(request.getProductoId()).get();
		
		
		prod.setDeptoId(request.getDeptoId());
		prod.setNombre(request.getNombre());
		prod.setFechaCad(request.getFechaCad());
		prod.setPrecioCompra(request.getPrecioCompra());
		prod.setPrecioVenta(request.getPrecioVenta());
		prod.setRefrigerado(request.getRefrigerado());

		
		productorep.save(prod);//actualizar
	return prod;	
		
	}

	@Override
	public Productos buscar(int id) {
	
		return productorep.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		productorep.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		return productorep.findAll();
	}
public int getIdProductIfExist(String nombre) {
	int id=0;
	
	//guarda la respuesta del metodo que devuelve un opcional
	Optional<Productos> prod= productorep.findByName(nombre);
	
	//si dentro del opcional hay algo...
	if(prod.isPresent()) {
		
		//le asigno a id el valor del productoId que viene dentro del objeto, que esta dentro del opcional
		id=prod.get().getProductoId();
		
	}
	return id;
}
}
