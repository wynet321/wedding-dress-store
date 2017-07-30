package com.cheetah.store.serviceImpl;

import com.cheetah.store.dao.PersonDAO;
import com.cheetah.store.model.Person;
import com.cheetah.store.service.PersonService;

public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;

	@Override
	public Person getPerson(String id) {
		personDAO=new PersonDAO();
		return personDAO.getById(id);
	}

}
