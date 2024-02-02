package com.msproductos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Integer>{
	
	//consulta que busque el id del producto por el nombre
	@Query("SELECT p FROM Productos p WHERE p.nombre =:nombre") // JPQL se le dice al metodo como resolver la consulta
	Optional<Productos>findByName(@Param("nombre")String nombre);//va a recibir el nombre del producto
	//si se ingresa un producto que no esta se retorna un opcional
	

}
