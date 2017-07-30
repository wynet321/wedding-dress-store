package com.cheetah.store.model;

import com.cheetah.store.dao.PersonDAO;

public class Person {
	String id;

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

}
