package com.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer> {
	//los repositoys no trabajan con primitivos
	//Consulta que busque el id del producto por el nombre
	//consulta jpql-->
	//pseudo lenguaje basaso en sql
	@Query("SELECT p FROM Productos p where p.nombre =:nombre")
	Optional<Productos> findByName(@Param("nombre")String nombre);
}
