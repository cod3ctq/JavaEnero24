package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductosService;




@Service
public class ProductoLogic implements ProductosService {


	@Autowired
	ProductoRepository proRepo;

	@Override
	public Productos guardar(ProductoRequest request) {
		Productos p =proRepo.findById(request.getProductoId()).get();
		p.setDeptoId(request.getDeptoId());
		p.setFechaCad(request.getFechaCad());
		p.setNombre(request.getNombre());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setPrecioVenta(request.getPrecioVenta());
		p.setRefrigerado(request.getRefrigerado());
		
		proRepo.save(p);
		return p;
	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		Productos p =proRepo.findById(request.getProductoId()).get();
		p.setDeptoId(request.getDeptoId());
		p.setFechaCad(request.getFechaCad());
		p.setNombre(request.getNombre());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setPrecioVenta(request.getPrecioVenta());
		p.setRefrigerado(request.getRefrigerado());
		
		proRepo.save(p);
		return p;
	}
		
	

	@Override
	public Productos buscar(int id) {
		// TODO Auto-generated method stub
	
		return proRepo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		proRepo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return proRepo.findAll();
	}
	
	public int getProductIfExist(String nombre) {
		int id =0;
		
		//Guarda la respuesra del metodo que devuelve un opcional
		Optional<Productos> prod = proRepo.findByName(nombre);
		if(prod.isPresent()) {
			//Le asigno a id el valor del productoId que viene dentro del objeto, que sta dentro del opcional
			id= prod.get().getProductoId();
		}
		return id;
	}
	
	
	
	

}
