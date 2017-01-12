package com.maijunjin.springdata.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maijunjin.springdata.test.dao.PersonRepository;
import com.maijunjin.springdata.test.model.User;

public class Application {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonRepository respository = context.getBean(PersonRepository.class);
		respository.save(new User("maijunjin"));
		System.out.println(respository.findByName("maijunjin"));
	}
}