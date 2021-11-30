package com.example.demo.service;


import java.util.List;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.PatientRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service 
@Component
public class ScheduledTasks {

    private AppointmentRepository appointmentRepository;


	@Scheduled(fixedRate = 10000)
	public void reportCurrentTime() {
		List<Appointment> appointment = appointmentRepository.findnotpayed();
		for  (Appointment a : appointment)   {
			appointmentRepository.deleteById(a.getId());
		}
		
	}
}