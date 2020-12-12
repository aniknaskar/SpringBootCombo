package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Persons;
import com.lti.service.SpringService;

@RestController
@CrossOrigin
public class SpringControllerConfig {

	@Autowired
	private SpringService service;
	
	@GetMapping("/getperson")
	public List<Persons> getAllPerson()
	{
		List<Persons> persons= service.getAllPerson();
		
		for(Persons p:persons)
		{
			System.out.println(p);
		}
		
		return persons;
	}
	
}
