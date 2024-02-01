package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentasService;
import com.persistence.dto.DetalleDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetVentas;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetVentasRepository;
import com.persistence.repository.EmpleadosRepository;

import com.persistence.repository.VentasRepository;
import com.persistence.request.VentasRequest;

@Service
public class VentasLogic implements VentasService {

	@Autowired
	VentasRepository agujaDinamica;

	@Autowired
	ClienteRepository cliRepo;

	@Autowired
	EmpleadosRepository emRepo;

	@Autowired
	DetVentasRepository dvRepo;

	// Cliente HTTP
	RestTemplate template = new RestTemplate();

//	@Autowired
//	ProductosRepository pRepo;

	@Override
	public Ventas guardar(VentasRequest request) {

		double subtotal = 0.0;
		int idProducto = 0;
		String nombre = "";
		Empleados e = emRepo.findById(request.getEmpleadoId()).get();
		Clientes c = cliRepo.findById(request.getClienteId()).get();
//		Productos p = pRepo.findById(request.getp);
		Ventas v = new Ventas();
		//Ventas vid = agujaDinamica.findById(request.getVentaId()).get();
		v.setEmpleado(e);
		v.setCliente(c);

		v.setFechaVenta(request.getFechaVenta());
		agujaDinamica.save(v);
		// Persistir los detalles de la venta
		for (DetalleDTO det : request.getDetalles()) {
			// apunta algo diferente por cada detalle
			DetVentas dtv = new DetVentas();
//			dtv.setProducto(p);
			nombre = det.getNombre();
			idProducto = template.getForObject("http://localhost:8084/productos/buscar-id/" + nombre, Integer.class);
			// Si es mayor a cero
			if (idProducto > 0) {
				dtv.setProductoId(idProducto);
				dtv.setCantidad(det.getCantidad());
//				dtv.setVentas(vid);
				dtv.setVentaId(v.getVentaId());
				dvRepo.save(dtv);
			}

		}
		return v;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		Ventas v = agujaDinamica.findById(request.getVentaId()).get();
		Empleados e = emRepo.findById(request.getEmpleadoId()).get();
		Clientes c = cliRepo.findById(request.getClienteId()).get();

		v.setEmpleado(e);
		v.setCliente(c);
		v.setFechaVenta(request.getFechaVenta());
		v.setSubtotal(request.getSubtotal());
		v.setTotal(request.getTotal());
		agujaDinamica.save(v);
		return v;
	}

	@Override
	public Ventas buscar(int id) {
		// TODO Auto-generated method stub
		return agujaDinamica.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		agujaDinamica.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return agujaDinamica.findAll();
	}

}
