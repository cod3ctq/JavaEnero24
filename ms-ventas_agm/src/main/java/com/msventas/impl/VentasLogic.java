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
	VentasRepository ventasrep;
	
	@Autowired
	ClienteRepository clienterep;
	
	@Autowired
	EmpleadosRepository empleadorep;
	
	@Autowired
	DetalleVentaRepository detventrep;
	
	//Cliente HTTP
	RestTemplate template= new RestTemplate();
	
	@Override
	public Ventas guardar(VentasRequest request) {
		double subtotal=0.0;
		int IdProducto=0;
		double total=0.0;
		String nombre="";
		
		Empleados e = empleadorep.findById(request.getEmpleadoId()).get();
		Clientes cli = clienterep.findById(request.getClienteId()).get();
		
		Ventas ven =new Ventas();
		ven.setFechaVenta(request.getFechaVenta());
		
		ven.setEmpleadoId(e);
		ven.setClienteId(cli);
		
		//se comenta porque se esta agregando arriba
		
		//ven.setEmpleadoId(request.getEmpleadoId());
		//ven.setClienteId(request.getClienteId());
		
		ven.setSubtotal(request.getSubtotal());
		ven.setTotal(request.getTotal());
		
		ventasrep.save(ven);//guarda los datos
		
		//persistir los detalles de la venta
		for(DetalleDTO det : request.getDetalles() ) {
			
			DetalleVenta dtv=new DetalleVenta();
			
			nombre=det.getNombre();
			IdProducto=template.getForObject("http://localhost:8089/productos/buscar-id/"+nombre,Integer.class);
			
			//Si es mayor a cero
			if(IdProducto>0) {
				dtv.setProductoId(IdProducto);
				dtv.setCantidad(det.getCantidad());
				dtv.setVentaId(ven.getVentaId());
				
				detventrep.save(dtv);
			}	
		}
		return ven;
	}

	
	
	@Override
	public Ventas actualizar(VentasRequest request) {

		Ventas ven= ventasrep.findById(request.getVentaId()).get();
				
//		ven.setEmpleadoId(request.getEmpleadoId());
//		ven.setClienteId(request.getClienteId());
		ven.setFechaVenta(request.getFechaVenta());
		ven.setSubtotal(request.getSubtotal());
		ven.setTotal(request.getTotal());
		
		ventasrep.save(ven);
		return ven;
	}

	@Override
	public Ventas buscar(int id) {
		return ventasrep.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		ventasrep.deleteById(id);
		return "Eliminado";		
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return ventasrep.findAll();
	}


}
