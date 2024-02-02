package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Productos;
import com.msproductos.repository.ProductosRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductoService;

@Service
public class ProductoLogic implements ProductoService {

	@Autowired
	ProductosRepository productoR;

	@Override
	public Productos guardar(ProductoRequest request) {
		Productos pro = new Productos();

		pro.setDeptoId(request.getDeptoId());
		pro.setNombre(request.getNombre());
		pro.setFechacad(request.getFechacad());
		pro.setPrecioCompra(request.getPrecioCompra());
		pro.setPrecioVenta(request.getPrecioVenta());
		pro.setRefrigerado(request.getRefrigerado());

		productoR.save(pro);// guarda los datos

		return pro;
	}

	@Override
	public Productos actualizar(ProductoRequest request) {

		Productos pro = productoR.findById(request.getProductoId()).get();

		pro.setDeptoId(request.getDeptoId());
		pro.setNombre(request.getNombre());
		pro.setFechacad(request.getFechacad());
		pro.setPrecioCompra(request.getPrecioCompra());
		pro.setPrecioVenta(request.getPrecioVenta());
		pro.setRefrigerado(request.getRefrigerado());

		productoR.save(pro);// guarda los datos
		return pro;
	}

	
	@Override
	public Productos buscar(int id) {

		return productoR.findById(id).get();
	}

	@Override
	public String eliminar(int id) {

		productoR.deleteById(id);
		;
		return "Eliminado";
	}

	@Override
	public List mostrar() {

		return productoR.findAll();

	}

	public int getIdProductIfExist(String nombre) {
		int id = 0;

		// Guardo la respuesta del metodo que devuelve un opcional
		Optional<Productos> prod = productoR.findByName(nombre);

		// Si dentro del opcional hay algo
		if (prod.isPresent()) {
			// le asigno a id el valor del porducto id que viene dentro del objeto, que esta
			// dentro del opcional
			id = prod.get().getProductoId();
		}
		return id;
	}

}
