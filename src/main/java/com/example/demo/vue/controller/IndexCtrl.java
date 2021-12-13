package com.example.demo.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;

import lombok.AllArgsConstructor;
@AllArgsConstructor

@Controller
public class IndexCtrl {
	private DoctorService doctorService;
	private PatientService patientService;
	@GetMapping({"/","/index"})
	public String getIndex() {
		return "index";
	}
	@GetMapping({"/admin/listdoctor"})
	public String getDoctorList(Model model) {
		model.addAttribute("listDoctor",doctorService.getAllDoctor() );
		return "admin/doctor-list";
	}
	@GetMapping({"/admin/listpatient"})
	public String getPatientList(Model model) {
		model.addAttribute("listPatient",patientService.getAllPatient() );
		return "admin/patient-list";
	}
	
}

