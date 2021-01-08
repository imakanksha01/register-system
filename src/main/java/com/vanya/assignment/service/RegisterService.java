package com.vanya.assignment.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanya.assignment.model.Person;
import com.vanya.assignment.model.Register;
import com.vanya.assignment.repository.PersonRepository;
import com.vanya.assignment.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository;

	@Autowired
	private PersonRepository personRepository;

	public Iterable<Register> getRegister() {
		return registerRepository.findAll();
	}

	public Iterable<Register> getRegisterBetweenDates(Date startDate, Date endDate) {
		return registerRepository.getAllRegisterBetweenDates(startDate, endDate);
	}

	public Register addRegister(Register register) {

		Long personId = register.getPerson().getId();
		if (personId != null) {
			Optional<Person> personOptional = personRepository.findById(personId);
			if (personOptional.isPresent()) {
				register.setPerson(personOptional.get());
			}
		}

		return registerRepository.save(register);
	}
}