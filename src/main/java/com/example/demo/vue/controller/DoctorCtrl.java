package com.example.demo.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import com.example.demo.service.AppointmentService;

import lombok.AllArgsConstructor;
@AllArgsConstructor

@Controller

public class DoctorCtrl {
 private AppointmentService appointmentService;
	
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
