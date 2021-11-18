package com.example.demo.controller;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@AllArgsConstructor
@RestController
public class DoctorController {
	
	private DoctorService doctorService;
	
	 @GetMapping("/doctor")
	    public List<Doctor> getId(){
	    	return doctorService.getAllDoctor();}
	
	
	@PostMapping("/adddoctor")  
   private long savePatient(@RequestBody Doctor doctor)   
   {  
		doctorService.adddoctor(doctor);  
   return doctor.getId();  
   }   

}
