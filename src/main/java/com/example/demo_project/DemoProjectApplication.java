package com.example.demo_project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.impl.PersonServiceimpl;

@SpringBootApplication
public class DemoProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
		PersonServiceimpl personservice = new PersonServiceimpl();
		Person person = personservice.getPersonInfo("YYY");
		personservice.printPersonSttributes(person);
	}

}
