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
public class ProductoLogic implements ProductoService{

	@Autowired
	ProductoRepository objeto;
	
	@Override
	public Productos guardar(ProductoRequest request) {
		
		Productos pro = new Productos();
		pro.setDeptoid(request.getDeptoid());
		pro.setNombre(request.getNombre());
		pro.setFechacaducidad(request.getFechacaducidad());
		pro.setPreciocompra(request.getPreciocompra());
		pro.setPrecioventa(request.getPrecioventa());
		pro.setRefrigerado(request.getRefrigerado());
		
		objeto.save(pro);
		
		return pro;
	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		Productos pro = objeto.findById(request.getProductoid()).get();
		pro.setDeptoid(request.getDeptoid());
		pro.setNombre(request.getNombre());
		pro.setFechacaducidad(request.getFechacaducidad());
		pro.setPreciocompra(request.getPreciocompra());
		pro.setPrecioventa(request.getPrecioventa());
		pro.setRefrigerado(request.getRefrigerado());
		
		objeto.save(pro);
		
		return pro;
	}

	@Override
	public Productos buscar(int id) {
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
	
	
	public int getIdProductoIfExist(String nombre) {
		int id = 0;
		
		Optional<Productos> prod = objeto.findByName(nombre);
		
		//Si dentro de opcional hay algo ...
		if(prod.isPresent()) {
			//Le asigno a id el valor del productoId que viene dentro del objeto, que esta dentro del opcional
			id = prod.get().getProductoid();
		}
		
		return id;
	}
	
	

}
