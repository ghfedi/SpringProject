package com.example.demo.controller;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@AllArgsConstructor
@RestController
public class PatientController {
	private PatientService patientService;
	
	 @GetMapping("/patient")
	    public List<Patient> getId(){
	    	return patientService.getAllPatient();}
	
	
	@PostMapping("/addpatient")  
    private long savePatient(@RequestBody Patient patient)   
    {  
		patientService.addpatient(patient);  
    return patient.getId();  
    }   
	
}
