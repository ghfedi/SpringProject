package com.example.demo.models.dto;

import java.time.LocalDateTime;

import com.example.demo.entity.AppointmentType;

import lombok.Data;

@Data
public class AppointmentReservation {
	
	 private LocalDateTime date;
	 
	 private long patientId;
	 
	 private long doctorId;
	 
	 private String description;
	 
	 private AppointmentType appointmentType;

}
