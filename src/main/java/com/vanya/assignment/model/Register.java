package com.vanya.assignment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private long personId;
	private Date entryTime;
	private Date exitTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getExitTime() {
		return exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Register [id=");
		builder.append(id);
		builder.append(", personId=");
		builder.append(personId);
		builder.append(", entryTime=");
		builder.append(entryTime);
		builder.append(", exitTime=");
		builder.append(exitTime);
		builder.append("]");
		return builder.toString();
	}

}
