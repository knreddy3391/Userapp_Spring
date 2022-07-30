package com.orspace.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orspace.www.entity.Person;

public interface PersonRepository extends JpaRepository<Person,String> {
	
}
