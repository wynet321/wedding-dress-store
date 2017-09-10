package com.cheetah.store.dao;

import com.cheetah.store.model.Person;

public class PersonDAO {
	public Person getById(String id) {
		Person test = new Person();
		test.setId(id);
		switch (id) {
		case "0":
			test.setName("dennis");
			break;
		case "1":
			test.setName("selina");
			break;
		case "2":
			test.setName("wendy");
			break;
		default:
			break;
		}

		return test;
	}
}
