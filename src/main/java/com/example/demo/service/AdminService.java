package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.DoctorRepository;

public class AdminService {
	 private DoctorRepository doctorRepository;
	 public Doctor validateById(int id, Doctor doctor) {
			Doctor newdoctor = doctorRepository.findOneByUserId(id);
			
			newdoctor.setEnabled(newdoctor.isEnabled());
			


			return doctorRepository.save(doctor);
			}

}
