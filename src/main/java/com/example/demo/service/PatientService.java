package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service 
public class PatientService {
	
	 private PatientRepository patientRepository;
	 
	 public List<Patient> getAllPatientByid(long id){
	 return patientRepository.findAllById(id);
	 }
	 
	 public List<Patient> getAllPatient(){
			return patientRepository.findAll();
			} 

	public void addpatient(Patient patient)   
	{  
		patientRepository.save(patient);  
	} 
	
}
