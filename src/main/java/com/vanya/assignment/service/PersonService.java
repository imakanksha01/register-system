package com.vanya.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanya.assignment.model.Person;
import com.vanya.assignment.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;

	public Person getPerson(Long id) {
		return repository.findById(id).get();
	}

	public Person addPerson(Person person) {
		return repository.save(person);
	}

	public Iterable<Person> findAll() {
        return repository.findAll();
    }
}
