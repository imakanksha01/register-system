package com.vanya.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanya.assignment.model.Person;
import com.vanya.assignment.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService service;

	@GetMapping("/{id}")
	public Person getPerson(@PathVariable Long id) {
		return service.getPerson(id);
	}

	@PostMapping(consumes = "application/json")
	public ResponseEntity<Person> addPerson(@RequestBody Person person) {
		Person addPerson = service.addPerson(person);
		return new ResponseEntity<Person>(addPerson, HttpStatus.OK);
	}

	@GetMapping("/all")
	public List<Person> getAllPersons() {
		return (List<Person>) service.findAll();

	}

}
