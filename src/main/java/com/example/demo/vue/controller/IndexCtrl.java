package com.example.demo.vue.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.entity.User;
import com.example.demo.service.AdminService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PatientRepository;


import lombok.AllArgsConstructor;
@AllArgsConstructor

@Controller
public class IndexCtrl {
	private DoctorService doctorService;
	private AdminService adminService;
	private PatientService patientService;
	private PatientRepository patientRepository;
	private DoctorRepository doctorRepository;
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
	@GetMapping("/signup")
	public String showRegistrationForm(Model model) {
	    model.addAttribute("patient", new Patient());
	     
	    return "register";
	}
	
	@PostMapping("/process_register")
	public String processRegister(Patient patient) {

	     
		patientRepository.save(patient);
	     
	    return "login";
	}
	@PostMapping("/process_edit")
	public String processEdit(Doctor doctor) {

	     doctorRepository.save(doctor);	     
	    return "/admin/listdoctor";
	}
	@RequestMapping("/searchdoctor")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Doctor> listDoctors = doctorService.getSearchDoctor(keyword);
        model.addAttribute("listDoctor", listDoctors);
        model.addAttribute("keyword", keyword);
         
        return "search";
    }
}

