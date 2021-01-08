package com.vanya.assignment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	@MapsId
	private Person person;
	private Date entryTime;
	private Date exitTime;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Register [id=");
		builder.append(id);
		builder.append(", person=");
		builder.append(person);
		builder.append(", entryTime=");
		builder.append(entryTime);
		builder.append(", exitTime=");
		builder.append(exitTime);
		builder.append("]");
		return builder.toString();
	}

}
