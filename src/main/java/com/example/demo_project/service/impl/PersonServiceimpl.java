package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

@Service//服務，需託管的意思
public class PersonServiceimpl implements PersonService {

	@Override
	public Person getPersonInfo(String id) {
		Person person = new Person();
		person.setName("Iris");
		person.setId(id);
		person.setCity("Kaoshiung");
		person.setAge(24);
		return person;
	}

	public void printPersonSttributes(Person person) {
//		Person person = new Person();
		System.out.println(person.getName());
		System.out.println(person.getId());
		System.out.println(person.getCity());
		System.out.println(person.getAge());
	}

//	public String getPersonId(Person person) {
//		return person.getId();
//	}
//	
//	public String getPersonName(Person person) {
//		return person.getName();
//		}
//	
//	public String getPersonCity(Person person) {
//		return person.getCity();
//		}
//	
//	public int getPersonAge(Person person) {
//		return person.getAge();
//		}
}
