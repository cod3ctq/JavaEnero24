package com.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.Clientes;
import com.general.Metodos;

public class ClienteDAO implements Metodos{

	//Carga los objetos (las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	//Carga todas las operaciones (insert, update, delete, selct, contar, etc)
	EntityManagerFactory em = (EntityManagerFactory) emf.createEntityManager();
	
	Clientes cliente = null;
	@Override
	public String guardar(Object ob) {
		cliente = (Clientes) ob;
		((EntityManager) em).getTransaction().begin();
		String resultado=null;
		try {
			 ((EntityManager) em).persist(cliente);
			 ((EntityManager) em).getTransaction().commit();
			 resultado ="1";
		System.out.println("Registro insertado");
		}catch(Exception e) {
			((EntityManager) em).getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();
		return resultado;
		}
			
	@Override
	public String editar(Object ob) {
		cliente = (Clientes) ob;
		Clientes clientedb = ((EntityManager) em).find(Clientes.class, cliente,getClienteId());
		String r = null;
		((EntityManager) em).getTransaction().begin();
		try {
			clientedb.setNombre(((Clientes) cliente).getNombre());
			clientedb.setDireccion(cliente.getDireccion());
			clientedb.setIne(cliente.getIne());
			clientedb.setTelefono(cliente.getTelefono());
			((EntityManager) em).getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";
		}catch(Exception e) {
			((EntityManager) em).getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}
	private Object getClienteId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		String r = null;
		cliente = ((EntityManager) em).find(Clientes.class, id);
		((EntityManager) em).getTransaction().begin();
		
		try {
			((EntityManager) em).remove(cliente);
			((EntityManager) em).getTransaction().commit();
		    System.out.println("Se ha eliminado el registro");
		    r = "1";
		}catch(Exception e) {
			((EntityManager) em).getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r =e.getMessage();
		}
		return r;
		
	}
	@Override
	public Object buscar(int id) {
		cliente = ((EntityManager) em).find(Clientes.class, id);
		return cliente;
	}
	@Override
	public List mostrar() {
		List<Clientes> ls = ((EntityManager) em).createQuery("from Clientes").getResultList();
		return ls;
	}
}
