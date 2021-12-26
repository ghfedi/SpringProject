package com.example.demo.repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	@Query("select a from Patient as a where a.id=?1")
	List<Patient> findAllById(long id);
	
	
    List<Patient> findAllByDoctorId(long doctorId);
    List<Patient> findAll();

}
