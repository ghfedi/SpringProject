package com.example.demo.repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
   

    List<Doctor> findAllByOrderByFirstNameAscLastName();
    List<Doctor> findByFirstName(String firstName);
    @Query("SELECT p FROM Doctor p WHERE CONCAT(p.firstName, p.lastName, p.address) LIKE %?1%")
    public List<Doctor> search(String keyword);

}
