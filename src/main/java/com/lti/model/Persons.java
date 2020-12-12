package com.lti.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Persons {

	@Id
	private String id;
	
	private String first_Name;
	
	private String last_Name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	@Override
	public String toString() {
		return "Persons [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + "]";
	}

	public Persons(String id, String first_Name, String last_Name) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
	}

	public Persons() {
		super();
	}
	
	
}
