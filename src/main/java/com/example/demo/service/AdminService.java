package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;
import com.example.demo.repository.DoctorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdminService {
	 private DoctorRepository doctorRepository;
	 public Doctor validateById(long id) {
			Doctor newdoctor = doctorRepository.findById(id).orElse(null);
			
			newdoctor.setEnabled(!newdoctor.isEnabled());
			


			return doctorRepository.save(newdoctor);
			}

}
