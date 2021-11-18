package com.example.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service 
public class DoctorService {
	
 private DoctorRepository doctorRepository;
	 
	 public List<Doctor> getAllDoctor(){
			return doctorRepository.findAll();
			} 

	public void adddoctor(Doctor doctor)   
	{  
		doctorRepository.save(doctor);  
	} 

}
