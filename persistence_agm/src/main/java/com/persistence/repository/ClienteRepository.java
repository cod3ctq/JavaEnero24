package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Clientes;

@Repository
//se pueden heredar varias interfaces pero en clases solo un
public interface ClienteRepository extends JpaRepository<Clientes, Integer>{


}
