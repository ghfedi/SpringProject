package com.example.demo.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import com.example.demo.entity.Patient;
import com.example.demo.service.AppointmentService;

import lombok.AllArgsConstructor;
@AllArgsConstructor

@Controller
public class PatientCtrl {
private AppointmentService appointmentService;
private PatientService patientService;
	
	@GetMapping({"/patientdashboard"})
	public String getappointments(Model model) {
		model.addAttribute("listAppointment",appointmentService.getAllAppointmentByPatient(2) );
		model.addAttribute("thisPatient",patientService.getAllPatientByid(2) );
		return "patient-dashboard";
	}
	

}
