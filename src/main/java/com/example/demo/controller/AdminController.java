package com.example.demo.controller;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
public class AdminController {
	
	private AdminService adminService;
	
	@PutMapping("/admin/enable/{id}")
	public Doctor updateDoctortById(@PathVariable int id,@RequestBody Doctor doctor) {
	    return adminService.validateById(id, doctor);
	    }


}
