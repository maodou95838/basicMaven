package com.jackie.maventest.dao.impl;

import com.jackie.maventest.dao.UserDao;
import com.jackie.maventest.domain.User;

public class UserDaoImpl implements UserDao {

	public void insert(User user) {
		System.out.println("insert user");
		
	}

	public User selectByPrimaryKey(Integer id) {
		System.out.println("select user");
		return null;
	}
	
}
