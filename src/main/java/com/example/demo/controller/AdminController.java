package com.example.demo.controller;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@AllArgsConstructor
@Controller
public class AdminController {
	
	private AdminService adminService;
	
	@GetMapping("/admin/enable/{id}")
	public String updateDoctortById(@PathVariable int id) {
	     adminService.validateById(id);
	     return "redirect:/admin/listdoctor";
	    }


}



