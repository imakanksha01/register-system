package com.vanya.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping
	public Register addRegister(@RequestBody Register entry) {
		return service.addRegister(entry);
	}
}