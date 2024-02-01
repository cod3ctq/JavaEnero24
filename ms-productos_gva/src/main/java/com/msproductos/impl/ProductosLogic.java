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
public class ProductosLogic implements ProductosService{

	@Autowired
	ProductosRepository prodRepo;

	@Override
	public Productos guardar(ProductosRequest request) {
		Productos p = new Productos();
		p.setDeptoId(request.getDeptoId());
		p.setFechaCad(request.getFechaCad());
		p.setNombre(request.getNombre());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setPrecioVenta(request.getPrecioVenta());
		p.setRefrigerado(request.getRefrigerado());
		prodRepo.save(p);
		return p;
	}

	@Override
	public Productos actualizar(ProductosRequest request) {
		Productos p = prodRepo.findById(request.getProductoId()).get();
		
		p.setDeptoId(request.getDeptoId());
		p.setFechaCad(request.getFechaCad());
		p.setNombre(request.getNombre());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setPrecioVenta(request.getPrecioVenta());
		p.setRefrigerado(request.getRefrigerado());
		
		prodRepo.save(p);
		return p;
	}

	@Override
	public Productos buscar(int id) {
		// TODO Auto-generated method stub
		
		return prodRepo.findById(id).get();
		
	}

	@Override
	public String eliminar(int id) {
		prodRepo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}
	
	
	public int getIdProductIfExist(String nombre) {
		int id = 0;
		//Guardo la respuesta del metodo que devuelve un opcional
		Optional<Productos> prod = prodRepo.findByName(nombre);
		//Si dentro del opcional hay algo ....
		if(prod.isPresent()) {
			//Le asigno a id el valor del productoId que viene dentro del objeto, que esta dentro del opcional
			id = prod.get().getProductoId();
		}
		return id;
	}
	


}