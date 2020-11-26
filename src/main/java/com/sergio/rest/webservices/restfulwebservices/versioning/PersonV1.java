package com.sergio.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {
	private String name;

	public PersonV1() {	super();}
	
	public PersonV1(String _name) {
		name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}