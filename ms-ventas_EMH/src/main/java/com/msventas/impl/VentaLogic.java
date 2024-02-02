package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentaService;
import com.persistence.dto.DetalleDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetalleVenta;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetalleVentaRepository;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.repository.VentaRepository;
import com.persistence.request.VentaRequest;

@Service
public class VentaLogic implements VentaService{

	@Autowired
	VentaRepository objeto;
	
	@Autowired
	ClienteRepository clienterepo;
	
	@Autowired
	EmpleadoRepository empleadorepo;
	
	@Autowired
	DetalleVentaRepository detverepo;
	
	//Cliente HTTP
	RestTemplate template = new RestTemplate();
	
	@Override
	public Ventas guardar(VentaRequest request) {
		
		//double subtotal = 0.0;
		//double total = 0.0;
		int idProducto = 0;
		String nombre = "";
		Empleados e = empleadorepo.findById(request.getEmpleadoId()).get();
		Clientes cli = clienterepo.findById(request.getClienteId()).get();
		Ventas ve = new Ventas();

		ve.setEmpleadoId(e);
		ve.setClienteId(cli);
		ve.setFechaVenta(request.getFechaVenta());
		ve.setSubtotal(request.getSubtotal());
		ve.setTotal(request.getTotal());

		objeto.save(ve);
		//Persistir los detalles de la venta
		for (DetalleDTO det : request.getDetalles()) {
			
			//Nuevo objeto detalle
			DetalleVenta dtv = new DetalleVenta();
			
			//http://localhost:8089/productos/buscar-id/
			nombre = det.getNombre();
			idProducto = template.getForObject("http://localhost:8089/productos/buscar-id/"+nombre, Integer.class);
			
			if(idProducto>0) {
				dtv.setProductoIdFK(idProducto);
				dtv.setVentaIdFk(ve.getVentaId());
				dtv.setCantidad(det.getCantidad());
				detverepo.save(dtv);
			}
		}
		
		return ve;
	}

	@Override
	public Ventas actualizar(VentaRequest request) {
		Ventas ve = objeto.findById(request.getVentaId()).get();
		//ve.setEmpleadoId(request.getEmpleadoId());
		//ve.setClienteId(request.getClienteId());
		ve.setFechaVenta(request.getFechaVenta());
		ve.setSubtotal(request.getSubtotal());
		ve.setTotal(request.getTotal());
		
		objeto.save(ve);
		
		return ve;
	}

	@Override
	public Ventas buscar(int id) {
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
