package com.example.demo.service;
import com.example.demo.repository.*;

import lombok.AllArgsConstructor;

import com.example.demo.entity.*;
import com.example.demo.models.dto.AppointmentReservation;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service 
public class AppointmentService {
	
    private AppointmentRepository appointmentRepository;
    
    public Appointment getById(long id) {
    	Optional<Appointment> opt = appointmentRepository.findById(id);
    	return opt.orElseThrow(()->new NoSuchElementException("Appointment with this id not found"));
    
    }
	public List<Appointment> getAllAppointment(){
	return appointmentRepository.findAll();
	} 
	public List<Appointment> getAllAppointmentByDoctor(long doctorId){
		return appointmentRepository.findAllByDoctorIdOrderByDate(doctorId);
		}
	
	public List<Appointment> getAllAppointmentByPatient(long patientId){
		return appointmentRepository.findAllByPatientIdOrderByDate(patientId);
		}
	
	public void addappointment(AppointmentReservation appointmentReservation)   
	{  
		LocalDateTime reference_date = appointmentReservation.getDate();
		long doctorid = appointmentReservation.getDoctorId();
		
		Appointment reference_appointment = appointmentRepository.findOneByDateAndDoctorId(reference_date,doctorid);
		System.err.println("ref"+reference_appointment);
		 if (reference_appointment != null) {
			 Patient patient = new Patient();
			 patient.setId(2);
			 reference_appointment.setAppointmentType(appointmentReservation.getAppointmentType());
			 reference_appointment.setPatient(patient);
			 appointmentRepository.save(reference_appointment);
		}  
		 else System.out.println("try another date");
	}  
	
	public Appointment updateById(int id, Appointment newAppointment) {
		Appointment appointment = getById(id);
		if(newAppointment.getDate()!=null)
			appointment.setDate(newAppointment.getDate());
		if(newAppointment.getAppointmentType()!=null)
			appointment.setAppointmentType(newAppointment.getAppointmentType());
		if(newAppointment.getDescription()!=null)
			appointment.setDescription(newAppointment.getDescription());


		return appointmentRepository.save(appointment);
		}
	
	public Appointment deleteAppointmentById(long id) {
		Appointment appointment = getById(id);
		appointmentRepository.deleteById(id);
		return appointment;
		}

}
