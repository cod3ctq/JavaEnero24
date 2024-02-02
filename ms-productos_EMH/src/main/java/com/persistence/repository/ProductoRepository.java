package com.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer>{

	//Consulta que busque el id del producto porel nombre
	//JPQL Java persistence Query SQL
	@Query("SELECT p FROM Productos p WHERE p.nombre =:nombre") //Apunta a objetos || SINTAXIS JPQL
	Optional<Productos> findByName (@Param("nombre")String nombre); //Retornamos objeto
	
}
