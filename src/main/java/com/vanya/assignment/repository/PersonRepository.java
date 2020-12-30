package com.vanya.assignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.vanya.assignment.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
