package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentasService;
import com.persistence.dto.DetalleDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetVenta;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetVentaRepository;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.repository.VentaRepository;
import com.persistence.request.VentaRequest;

@Service
public class VentaLogic implements VentasService {
	
	@Autowired
	VentaRepository vent;
	
	@Autowired
	ClienteRepository cliRepo;
	
	@Autowired
	EmpleadoRepository emRepo;
	
	@Autowired
	DetVentaRepository dvRepo;
	
	//Cliente HTP
	RestTemplate template = new RestTemplate();
	
	
	@Override
	public Ventas guardar(VentaRequest request) {
		
		double subtotal =0.0;
		int idProducto=0;
		String nombre = "";


		Empleados e= emRepo.findById (request.getEmpleadoId()).get();
		Clientes c= cliRepo.findById(request.getClienteId()).get();
		Ventas ven = new Ventas();
		ven.setFechaVenta(request.getFechaVenta());
		ven.setEmpleado (e);
		ven.setCliente(c);
		ven.setSubtotal(request.getSubtotal());
		ven.setTotal(request.getTotal());
		
		vent.save (ven); //guarda los datos
		
		//Persistir los detalles de la venta
		
		for (DetalleDTO det :request.getDetalles()) {
			
			//Crea un nuevo objeto detalle
			DetVenta dtv = new DetVenta();
			
			nombre = det.getNombre();	
			idProducto = template.getForObject("http://localhost:8084/items/buscar-por-nombre/"+ nombre, Integer.class);
			
			//Si es mayor a cero
			if(idProducto>0) {
				
				dtv.setVentaId (ven.getVentaId());
				dtv.setProductoId(idProducto);
				dtv.setCantidad (det.getCantidad());
				dvRepo.save(dtv);
				
				
			}
		
		}

		return ven;
	}

	@Override
	public Ventas actualizar(VentaRequest request) {
		
		Ventas ven = vent.findById(request.getClienteId()).get();
		Empleados e= emRepo.findById (request.getEmpleadoId()).get();
		Clientes c= cliRepo.findById(request.getClienteId()).get();
		ven.setEmpleado (e);
		ven.setCliente(c);
		ven.setFechaVenta(request.getFechaVenta());
		ven.setSubtotal(request.getSubtotal());
		ven.setTotal(request.getTotal());
		ven.setVentaId(request.getVentaId());

		vent.save(ven);//Guarda los datos
		return ven;
	}

	@Override
	public Ventas buscar(int id) {
		// TODO Auto-generated method stub
		return vent.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		vent.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return vent.findAll();
	}

	

}
