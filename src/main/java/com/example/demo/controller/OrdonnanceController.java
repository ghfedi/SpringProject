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
public class OrdonnanceController {
private OrdonnanceService ordonnanceService;

@GetMapping("/ordonnancebypatient/{patientId}")
public List<Ordonnance> getordonnancebypatient(@PathVariable long patientId){
	return ordonnanceService.getAllOrdonnanceByPatient(patientId);
}
}
