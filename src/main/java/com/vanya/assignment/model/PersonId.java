package com.vanya.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PersonId {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String fatherName;
	private String dobDDMMYYYY;

	public PersonId() {
		super();
	}

	public PersonId(String firstName, String fatherName, String dobDDMMYYYY) {
		super();
		this.firstName = firstName;
		this.fatherName = fatherName;
		this.dobDDMMYYYY = dobDDMMYYYY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dobDDMMYYYY == null) ? 0 : dobDDMMYYYY.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonId other = (PersonId) obj;
		if (dobDDMMYYYY == null) {
			if (other.dobDDMMYYYY != null)
				return false;
		} else if (!dobDDMMYYYY.equals(other.dobDDMMYYYY))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonId [firstName=");
		builder.append(firstName);
		builder.append(", fatherName=");
		builder.append(fatherName);
		builder.append(", dobDDMMYYYY=");
		builder.append(dobDDMMYYYY);
		builder.append("]");
		return builder.toString();
	}

}
