package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.persistence.entity.Ventas;

@Repository
	//se pueden heredar varias interfaces pero en clases solo una

public interface VentasRepository extends JpaRepository <Ventas,Integer>{
	

}


