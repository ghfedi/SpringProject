package com.example.demo.repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	Patient findOneByUserId(long userId);

    List<Patient> findAllByDoctorId(long doctorId);
    List<Patient> findAll();

}
