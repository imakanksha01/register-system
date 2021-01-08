package com.vanya.assignment.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.vanya.assignment.model.Register;

public interface RegisterRepository extends CrudRepository<Register, Long> {

	@Query(value = "from Register r where insertDate BETWEEN :startDate AND :endDate")
	public List<Register> getAllRegisterBetweenDates(@Param("startDate") Date startDate,
			@Param("endDate") Date endDate);
}
