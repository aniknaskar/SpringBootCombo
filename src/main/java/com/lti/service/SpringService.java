package com.lti.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.lti.model.Persons;
import com.lti.repository.SpringRepository;

@Service
public class SpringService {

	@Autowired
	private SpringRepository repository;
	
	@Bean
	public CacheManager cacheManager() {
		SimpleCacheManager cacheManager = new SimpleCacheManager();
		cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("person")));
		return cacheManager;
	}
	
	@Cacheable(value = "person")
	public List<Persons> getAllPerson()
	{
		List<Persons> allPersons=repository.findAll();
		System.out.println("Inside Service");
		return allPersons;
	}
	
}
