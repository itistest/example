package com.maijunjin.springdata.test.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.maijunjin.springdata.test.model.User;

public interface PersonRepository extends Repository<User, Long> {

	List<User> findByName(String name);
	User save(User user);
}