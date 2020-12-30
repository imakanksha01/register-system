package com.vanya.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vanya.assignment.model.Person;
import com.vanya.assignment.service.RegisterSystemService;

@RestController
public class RegisterSystemRestController {

	@Autowired
	private RegisterSystemService service;

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable Long id) {
		return service.getPerson(id);
	}

	@PostMapping(path = "/person", consumes = "application/json")
	public Person addPerson(@RequestBody Person person) {
		return service.addPerson(person);
	}

	@GetMapping("/person")
	public List<Person> getAllPersons() {
		return (List<Person>) service.findAll();
		
	}

}
