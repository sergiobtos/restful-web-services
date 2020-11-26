package com.sergio.rest.webservices.restfulwebservices.versioning;

public class PersonV2 {
	private Name name;

	public PersonV2() {
		super();
	}

	public PersonV2(Name _name) {
		name = _name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}