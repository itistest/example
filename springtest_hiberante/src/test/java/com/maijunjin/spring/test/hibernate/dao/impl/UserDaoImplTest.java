package com.maijunjin.spring.test.hibernate.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maijunjin.spring.test.hibernate.dao.UserDao;
import com.maijunjin.spring.test.hibernate.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoImplTest {
	@Autowired 
	UserDao userDao;
	@Test
	public void testSave() {
		userDao.save(new User("username1"));
	}

	@Test
	public void testFindUser() {
		System.out.println(userDao.findUser("username1"));
	}

}
