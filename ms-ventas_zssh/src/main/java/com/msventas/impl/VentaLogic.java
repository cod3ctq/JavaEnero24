package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentaService;
import com.persestence.dto.DetalleDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetalleVentas;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetalleVentasRepository;
import com.persistence.repository.EmpleadosRepository;
import com.persistence.repository.ProductoRepository;
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
	
	//nuevo
//	@Autowired
//	ProductoRepository proRep;
	//Cliente HTTP
	RestTemplate template = new RestTemplate();
	
	@Override
	public Ventas guardar(VentasRequest request) {
//		double subtotal = 0.0;
//		double total = 0.0;
		
		int idProducto=0;
		String nombre="";
		
		Empleados e = emRepo.findById(request.getEmpleadoId()).get();
		Clientes c = cliRepo.findById(request.getClienteId()).get();
		//nuevo
		
		
		Ventas ven = new Ventas();
		Ventas vid = venta.findById(request.getVentasId()).get();
		ven.setFechaVenta(request.getFechaVenta());
		ven.setEmpleado(e);
		ven.setCliente(c);
		ven.setSubtotal(request.getSubtotal());
		ven.setTotal(request.getTotal());
		venta.save(ven);
		//persistir en los detalles venta
		
		for(DetalleDTO det : request.getDetalles()) {
			//apunta algo difente por cada detalle
			//Crea un objeto detalle
			DetalleVentas dtv = new DetalleVentas();
			
			nombre = det.getNombre();
			idProducto = template.getForObject("http://localhost:8090/productos/buscar-id/"+nombre,Integer.class);
			
			//si es mayor a cero
			if(idProducto>0) {
				dtv.setVentaId(ven.getVentaId());
				dtv.setProductoId(idProducto);
				dtv.setCantidad(det.getCantidad());
				dvRepo.save(dtv);//gusrda en el repositorio
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
	
	
	
	
}






