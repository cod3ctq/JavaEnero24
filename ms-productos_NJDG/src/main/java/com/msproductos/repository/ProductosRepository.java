package com.msproductos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Integer>{

	
	//Consulta que busque el id del prodcuto por el nombre 
	@Query("SELECT p FROM Productos p WHERE p.nombre =:nombre") //JPQL
	Optional<Productos> findByName(@Param("nombre")String nombre);
	
	
	
	
}
