package com.example.demo.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.AdminService;
import com.example.demo.service.DoctorService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Controller
public class SearchCtrl {
	private DoctorService doctorService;
	

	
	@GetMapping("/search")
	public String getAllDoctor(Model model) {
		
		model.addAttribute("listDoctor",doctorService.getAllDoctor() );
		return "search";
	}
}
