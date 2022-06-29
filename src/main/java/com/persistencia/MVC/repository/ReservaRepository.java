package com.persistencia.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.persistencia.MVC.model.Reserva;

@Repository

public interface ReservaRepository extends  JpaRepository <Reserva, String> {

}