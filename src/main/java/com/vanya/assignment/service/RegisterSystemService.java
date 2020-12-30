package com.vanya.assignment.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanya.assignment.model.Person;
import com.vanya.assignment.repository.PersonRepository;

@Service
public class RegisterSystemService {
	
	@Autowired
	private PersonRepository repository;

	public Person getPerson() {
		return new Person("Akanksha", "Singh", 21, new Date());
	}

	public Person addPerson(Person person) {
		return repository.save(person);
	}

}
