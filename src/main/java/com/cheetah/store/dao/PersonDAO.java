package com.cheetah.store.dao;

import com.cheetah.store.model.Person;

public class PersonDAO {
	public Person getById(String id){
		Person test=new Person();
		test.setId("0");
		test.setName("dennis");
		return test;
	}
}
