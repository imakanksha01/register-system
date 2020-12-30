package com.vanya.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vanya.assignment.model.Person;
import com.vanya.assignment.repository.PersonRepository;
import com.vanya.assignment.type.Gender;

@Component
public class DefaultDataLoader implements CommandLineRunner {

	@Autowired
	private PersonRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Person("Deepa", "Singh", 24, Gender.FEMALE));
		repository.save(new Person("Kajal", "Agrawal", 20, Gender.FEMALE));
		repository.save(new Person("Chintu", "jaiswal", 15, Gender.MALE));
		repository.save(new Person("Golu", "Kumar", 30, Gender.MALE));
	}

}
