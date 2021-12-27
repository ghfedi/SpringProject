package com.example.demo.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import com.example.demo.entity.Appointment;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.service.AppointmentService;

import lombok.AllArgsConstructor;
@AllArgsConstructor

@Controller

public class DoctorCtrl {
 private AppointmentService appointmentService;
 private AppointmentRepository appointmentRepository;
	@GetMapping({"/schedule"})
	public String getIndex(Model model) {
		model.addAttribute("appointment", new Appointment());
		return "schedule-timings";
	}
	
	@PostMapping("/process_appointment")
	public String processaddappointment(Appointment appointment) {
		Doctor doctor = new Doctor();
		doctor.setId(3);
	     appointment.setDoctor(doctor);
		appointmentRepository.save(appointment);
	     
	    return "appointments";
	}
	@GetMapping({"/doctordashboard"})
	public String getappointments(Model model) {
		model.addAttribute("listAppointment",appointmentService.getAllAppointmentByDoctor(3) );
		return "doctor-dashboard";
	}
	@GetMapping({"/appointments"})
	public String getallappointments(Model model) {
		model.addAttribute("listAppointment",appointmentService.getAllAppointmentByDoctor(3) );
		return "appointments";
	}
}
