package com.persistencia.MVC.repository;

import com.persistencia.MVC.model.Hospede;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Long> {

}