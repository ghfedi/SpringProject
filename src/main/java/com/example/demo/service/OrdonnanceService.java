package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Ordonnance;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.OrdonnanceRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service 
public class OrdonnanceService {
	private OrdonnanceRepository ordonnanceRepository;

	public List<Ordonnance> getAllOrdonnanceByPatient(long patientId) {
		return ordonnanceRepository.findAllByPatientId(patientId);
	}

}
