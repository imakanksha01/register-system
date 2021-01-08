package com.vanya.assignment.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanya.assignment.model.Register;
import com.vanya.assignment.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private RegisterService service;

	@GetMapping
	public Iterable<Register> getRegister() {
		return service.getRegister();
	}
	
	@GetMapping(path = "/betweenDates")
	public Iterable<Register> getRegisterBetweenDates(@RequestHeader Date startDate, @RequestHeader Date endDate) {
		return service.getRegisterBetweenDates(startDate, endDate);
	}

	@PostMapping
	public Register addRegister(@RequestBody Register entry) {
		return service.addRegister(entry);
	}
}