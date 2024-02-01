package com.productos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.productos.entity.Productos;

@Repository
public interface ProductoRepository extends JpaRepository <Productos, Integer>{

	
	
	//Consulta que busque el id del producto por el nombre
	@Query("SELECT pro FROM Productos pro WHERE pro.nombre =:nombre")//JPQL
	Optional <Productos> findByName (@Param("nombre")String nombre);
	
	
}
