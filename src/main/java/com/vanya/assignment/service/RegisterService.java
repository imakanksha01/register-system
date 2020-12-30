package com.vanya.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanya.assignment.model.Register;
import com.vanya.assignment.repository.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	private RegisterRepository repository;


	public Iterable<Register> getRegister() {
        return repository.findAll();
    }
}
