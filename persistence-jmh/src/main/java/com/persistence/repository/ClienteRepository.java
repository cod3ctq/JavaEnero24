package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.persistence.entity.Clientes;

@Repository //Anotacion de Spring
public interface ClienteRepository extends JpaRepository <Clientes, Integer> {

}
