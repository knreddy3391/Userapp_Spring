//package com.orspace.www.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.orspace.www.entity.Person;
//import com.orspace.www.repository.PersonRepository;
//
//@Service
//public class PersonService {
//
//	@Autowired
//	public PersonRepository personRepo;
//	@Autowired
//	public Person person;
//	
//	public List<Person> getAllPerons(){
//		return personRepo.findAll();
//	}
//	
//	@Autowired
//	public void addPerson(Person p) {
//		personRepo.save(p);
//	}
//	
//}
