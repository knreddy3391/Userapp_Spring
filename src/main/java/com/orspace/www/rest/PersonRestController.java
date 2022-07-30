package com.orspace.www.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orspace.www.entity.Person;
import com.orspace.www.repository.PersonRepository;

@RestController
public class PersonRestController {

	@Autowired
	private PersonRepository personRepo;
	
	@PostMapping(value="/AddUser",consumes = "application/json")
	public String AddUserToDb(@RequestBody Person person) {
		Person save = personRepo.save(person);
		return save.toString();
	}
	
	@GetMapping(value="/GetUsers",produces="application/json")
	public ResponseEntity<List<Person>> getUsers(){
		List<Person> persons= personRepo.findAll();
		return new ResponseEntity<>(persons,HttpStatus.OK);
	}
}
