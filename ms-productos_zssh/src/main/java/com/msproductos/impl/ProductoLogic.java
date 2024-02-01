package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.service.ProductoService;
import com.persistence.entity.Productos;
import com.persistence.repository.ProductoRepository;
import com.persistence.request.ProductoRequest;

@Service
public class ProductoLogic  implements ProductoService{

	@Autowired
	ProductoRepository prodRep;
	
	
	@Override
	public Productos guardar(ProductoRequest request) {
		Productos pro = new Productos();
		
		pro.setDeptoId(request.getDeptoId());
		pro.setNombre(request.getNombre());
		pro.setFechaCad(request.getFechaCad());
		pro.setPrecioCompra(request.getPrecioCompra());
		pro.setPrecioVenta(request.getPrecioVenta());
		pro.setRefrigerado(request.getRefrigerado());
		
		prodRep.save(pro);
		return pro;
	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		Productos pro = prodRep.findById(request.getProductoId()).get();
		
		pro.setDeptoId(request.getDeptoId());
		pro.setNombre(request.getNombre());
		pro.setFechaCad(request.getFechaCad());
		pro.setPrecioCompra(request.getPrecioCompra());
		pro.setPrecioVenta(request.getPrecioVenta());
		pro.setRefrigerado(request.getRefrigerado());
		
		prodRep.save(pro);
		return pro;
	}

	@Override
	public Productos buscar(int id) {
		
		return prodRep.findById(id).get();
		
	}

	@Override
	public String eliminar(int id) {
		prodRep.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {

		return prodRep.findAll();
		
	}
	
	public int getProductoIfExist(String nombre) {
		int id=0;
		//Guardo la respuesta del metodo que devuelve un opcional
		Optional<Productos> prod = prodRep.findByName(nombre);
		//si dentro del opcional hay algo...
		if(prod.isPresent()) {
			//le asigno a id el valor de productoId que viene dentro del
			//objeto que esta dentro del opcional
			id= prod.get().getProductoId();
		}
		return id;
	}

}
