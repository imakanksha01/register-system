package com.vanya.assignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.vanya.assignment.model.Register;

public interface RegisterRepository extends CrudRepository<Register, Long> {
}
