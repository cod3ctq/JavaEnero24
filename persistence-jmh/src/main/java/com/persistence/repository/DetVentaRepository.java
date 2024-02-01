package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.persistence.entity.DetVenta;


@Repository //Anotacion de Spring
public interface DetVentaRepository extends JpaRepository <DetVenta, Integer> {

}
