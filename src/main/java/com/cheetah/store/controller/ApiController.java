package com.cheetah.store.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cheetah.store.model.Person;
import com.cheetah.store.service.PersonService;
import com.cheetah.store.serviceImpl.PersonServiceImpl;

@RestController
public class ApiController {

	@RequestMapping("/api/{id}")
	public String getPersonName(@PathVariable(value = "id") String id) {
		PersonService personService = new PersonServiceImpl();
		Person person = personService.getPerson(id);
		return person.getName();

	}
}
