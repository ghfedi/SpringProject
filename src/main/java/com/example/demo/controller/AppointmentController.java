package com.example.demo.controller;
import com.example.demo.entity.*;
import com.example.demo.service.*;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;



@AllArgsConstructor
@RestController
public class AppointmentController {
    private AppointmentService appointmentService;
    
    @GetMapping("/appointment")
    public List<Appointment> getId(){
    	return appointmentService.getAllAppointment();
}
    @GetMapping("/appointmentbydoctor/{doctorId}")
    public List<Appointment> getappointmentbydoctor(@PathVariable long doctorId){
    	return appointmentService.getAllAppointmentByDoctor(doctorId);
}
    @GetMapping("/appointmentbypatient/{patientId}")
    public List<Appointment> getappointmentbypatient(@PathVariable long patientId){
    	return appointmentService.getAllAppointmentByPatient(patientId);
}
    @PostMapping("/addapointment")  
    private long saveAppointment(@RequestBody Appointment appointment)   
    {  
    	appointmentService.addappointment(appointment);  
    return appointment.getId();  
    }     
    
    @PutMapping("appointment/update/{id}")
    public Appointment updateAppointmentById(@PathVariable int id,@RequestBody Appointment newAppointment) {
    return appointmentService.updateById(id, newAppointment);
    }
    
    @DeleteMapping("/appointment/delete/{id}")
    public Appointment deleteAppointmenById(@PathVariable int id) {
    return appointmentService.deleteAppointmentById(id);
    }


}

