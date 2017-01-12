package com.maijunjin.spring.test.hibernate.dao;

import java.util.List;

import com.maijunjin.spring.test.hibernate.model.User;

public interface UserDao {
	
	public void save(User user);
	
	public List<User> findUser(String name);
}
