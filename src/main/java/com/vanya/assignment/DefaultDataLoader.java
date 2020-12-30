package com.vanya.assignment;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vanya.assignment.model.Person;
import com.vanya.assignment.repository.PersonRepository;

@Component
public class DefaultDataLoader implements CommandLineRunner {
	
	@Autowired
	private PersonRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Person("Deepa", "Singh", 24, new Date()));
		repository.save(new Person("Kajal", "Agrawal", 20, new Date()));
		repository.save(new Person("Chintu", "jaiswal", 15, new Date()));
		repository.save(new Person("Golu", "Kumar", 30, new Date()));
	}

}
