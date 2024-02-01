package com.msproductos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;


@Repository //Anotacion de Spring
public interface ProductoRepository extends JpaRepository <Productos, Integer> {

	
	//Consulta que busque el id del producto por el nombre
	@Query("SELECT p FROM Productos p WHERE p.nombre =:nombre")// consulta de JPQL
	Optional <Productos>findByName (@Param("nombre")String nombre);
	
	
}
