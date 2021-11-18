package com.example.demo.repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor findOneByUserId(long userId);

    List<Doctor> findAllByOrderByFirstNameAscLastName();

}