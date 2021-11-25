package com.example.demo.repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface OrdonnanceRepository  extends JpaRepository<Ordonnance, Long> {
	List<Ordonnance> findAllByPatientId(long patientId);
}
