package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentaService;
import com.persistence.dto.DetalleDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetalleVentas;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetalleVentasRepository;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.repository.VentasRepository;
import com.persistence.request.VentasRequest;

@Service
public class VentaLogic implements VentaService {

	@Autowired
	VentasRepository venta;
	
	@Autowired
	ClienteRepository cliRepo;
	
	@Autowired
	EmpleadosRepository emRepo;
	
	@Autowired
	DetalleVentasRepository dvRepo;
	
	//Cliente HTTP
	RestTemplate template = new RestTemplate();
	
	@Autowired
	public Ventas guardar(VentasRequest request, CrudRepository<Clientes, Integer> objeto) {
		
		double subtotal = 0.0;
		int idProducto = 0;
		String nombre = "";
		Empleados e = emRepo.findById(request.getEmpleadoId()).get();
		Clientes c = cliRepo.findById(request.getClienteId()).get();		
		Ventas ven = new Ventas();
		ven.setFechaVenta(request.getFechaVenta());		
		ven.setEmpleado(e);
		ven.setCliente(c);
		ven.setSubtotal(request.getSubtotal());
		ven.setTotal(request.getTotal());
		venta.save(ven); //guardar en el repository
		 
		//persistir los detalles de ventas
		for(DetalleDTO det : request.getDetalles()) {
		//crea un nuevo objeto detalle
			
			
			DetalleVentas dtv=new DetalleVentas();	
			
			nombre = det.getNombre();
			idProducto = template.getForObject("http:localhost:8089/productos/buscar-id/"+nombre, Integer.class);
			
			//Si es mayo a cero
			if(idProducto>0) {
				
				dtv.setDetVentaId(ven.getVentaId());
				dtv.setProductoId(idProducto);
				dtv.setCantidad(det.getCantidad());
				dvRepo.save(dtv);
				
			}	
		}	
		return ven;
	}
	@Override
	public Ventas actualizar(VentasRequest request) {
		
		Ventas ven = venta.findById(request.getClienteId()).get();
		
		ven.setFechaVenta(request.getFechaVenta());
		ven.setSubtotal(request.getSubtotal());
		ven.setTotal(request.getTotal());
		
		
		venta.save(ven);
		
		return ven;
	}
	@Override
	public Ventas buscar(int id) {
		
		return venta.findById(id).get();
	}
	@Override
	public String eliminar(int id) {
		venta.deleteById(id);
		return "Eliminar";
	}
	@Override
	public List mostrar() {
		return venta.findAll();
	}
	@Override
	public Ventas guardar(VentasRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
}






