package com.persistencia.MVC.repository;

<<<<<<< .merge_file_a19024
import com.persistencia.MVC.model.Hospede;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Long> {

}
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistencia.MVC.model.Hospede;

@Repository
public interface HospedeRepository extends JpaRepository <Hospede, Integer> {
    
}
>>>>>>> .merge_file_a09976
