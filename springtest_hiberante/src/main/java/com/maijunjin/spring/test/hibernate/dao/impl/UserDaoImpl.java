package com.maijunjin.spring.test.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maijunjin.spring.test.hibernate.dao.UserDao;
import com.maijunjin.spring.test.hibernate.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(User user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		 session.save(user);
		session.getTransaction().commit();
	}

	public List<User> findUser(String name) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query<User> query = session.createQuery("FROM User AS u WHERE u.name = :name");
		query.setParameter("name", name);
		List<User> userList =  query.getResultList();
		session.getTransaction().commit();
		return userList;
	}

}
