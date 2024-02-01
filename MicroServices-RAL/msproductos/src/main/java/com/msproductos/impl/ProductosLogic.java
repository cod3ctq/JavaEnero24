package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.service.ProductoService;
import com.productos.entity.Productos;
import com.productos.repository.ProductoRepository;
import com.productos.request.ProductoRequest;

@Service
public class ProductosLogic implements ProductoService {

	@Autowired
	ProductoRepository objeto;

	@Override
	public Productos guardar(ProductoRequest request) {
		Productos pro  = new Productos();
		pro.setDeptoId(request.getDeptoId());
		pro.setNombre(request.getNombre());
		pro.setFechaCad(request.getFechaCad());
		pro.setPrecioCompra(request.getPrecioCompra());
		pro.setPrecioVenta(request.getPrecioVenta());
		pro.setRefrigerado(request.getRefrigerado());
		objeto.save(pro); //guarda los datos
		return pro;
	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		Productos pro  = objeto.findById(request.getProductoId()).get();
		pro.setDeptoId(request.getDeptoId());
		pro.setNombre(request.getNombre());
		pro.setFechaCad(request.getFechaCad());
		pro.setPrecioCompra(request.getPrecioCompra());
		pro.setPrecioVenta(request.getPrecioVenta());
		pro.setRefrigerado(request.getRefrigerado());
		objeto.save(pro); //guarda los datos
		return pro;
	}

	@Override
	public Productos buscar(int id) {
		// TODO Auto-generated method stub
	
		return objeto.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		objeto.deleteById(id);
		return "Elmineishon";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return objeto.findAll();
	}
	
	
	public int getInProductIfExist(String nombre) {
		int id=0;
		
	//Guarda la respuesta del metodo que devuelve un opcional
		Optional<Productos> prod = objeto.findByName(nombre);
	
	//Si dentro del opcional hay algo....
		if(prod.isPresent()) {
			//Le asigno a id el valor del productoId que viene dentro del objeto
			//que esta dentro del opcional
			id = prod.get().getProductoId();
		}
		return id;
		
	}
	
}
