package com.example.demo.repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
	/** Bech nlawjou 3le les rendez-vous bin date debut w date fin by doctorid */
	@Query("select a from Appointment as a where a.date between ?1 and ?2 and a.doctor.id = ?3")
    List<Appointment> findAllBetweenDatesByDoctorId(Date startDate, Date endDate, long doctorId);
	
	/** Bech nlawjou 3le les rendez-vous bin date debut w date fin */
    @Query("select a from Appointment as a where a.date between ?1 and ?2")
    List<Appointment> findAllBetweenDates(Date startDate, Date endDate);

    List<Appointment> findAllByPatientIdOrderByDate(long patientId);
    List<Appointment> findAll();


    List<Appointment> findAllByDoctorIdOrderByDate(long doctorId);


    Appointment findOneByDateAndDoctorId(LocalDateTime reference_date, long doctorId);

}
