package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentasService;
import com.persistence.dto.DetalleDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetalleVenta;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetalleVentaRepository;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.repository.VentasRepository;
import com.persistence.request.VentasRequest;

@Service
public class VentasLogic implements VentasService{
	
	
	@Autowired
	VentasRepository objeto;
	
	@Autowired
	ClienteRepository cliRepo;
	
	@Autowired
	EmpleadosRepository emRepo;
	
	@Autowired
	DetalleVentaRepository dvRepo;//------------//
	
	//Cliente HTTP
	RestTemplate template = new RestTemplate();
	

	@Override
	public Ventas guardar(VentasRequest request) {

		double Subtotal = 0.0;
		int idProducto = 0;
		String nombre = "";
		Empleados e = emRepo.findById(request.getEmpleadoId()).get();
		Clientes c = cliRepo.findById(request.getClienteId()).get();					
		Ventas vent  = new Ventas();
		vent.setFechaVenta(request.getFechaVenta());
		vent.setEmpleado(e);
		vent.setCliente(c);
		vent.setSubtotal(request.getSubtotal());
		vent.setTotal(request.getTotal());		
		objeto.save(vent); //guarda los datos
		
		//Persistir lo detalles de la venta
		
		for(DetalleDTO det : request.getDetalles()) {			
			//Crea un nuevo objeto detalle
			DetalleVenta dtv = new DetalleVenta();
			
			
			nombre = det.getNombre();
			idProducto = template.getForObject("http://localhost:8089/productos/buscar-id/" + nombre, Integer.class);		
			
			//Si es mayor a cero
			if(idProducto > 0) {
				dtv.setProductoId(idProducto);
				dtv.setCantidad(det.getCantidad());
				dtv.setVentaId(vent.getVentaId());
				dvRepo.save(dtv);	
			}	
		}
		
		return vent;
		
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		Ventas vent  = objeto.findById(request.getVentaId()).get();
		vent.setFechaVenta(request.getFechaVenta());
		vent.setSubtotal(request.getSubtotal());
		vent.setTotal(request.getTotal());
		objeto.save(vent); //guarda los datos
		return vent;
	}

	@Override
	public Ventas buscar(int id) {
		// TODO Auto-generated method stub
		return objeto.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		objeto.deleteById(id);
		return "Elminao";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return objeto.findAll();
	}

}
