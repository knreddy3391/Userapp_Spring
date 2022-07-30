package com.orspace.www.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person {
	@Id
	private String Email;
	@Column(name = "FIRST_NAME")
	private String FirstName;
	@Column(name = "LAST_NAME")
	private String LastName;
	@Column(name = "CONTACT")
	private Long Contact;
}
