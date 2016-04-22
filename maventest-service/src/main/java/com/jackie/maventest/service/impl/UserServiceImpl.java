package com.jackie.maventest.service.impl;

import com.jackie.maventest.dao.UserDao;
import com.jackie.maventest.domain.User;
import com.jackie.maventest.service.UserService;

public class UserServiceImpl implements UserService {

	public void add(User user) {
		userDao.insert(user);
	}

	public User findById(User user) {
		return userDao.selectByPrimaryKey(user.getId());
	}
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	private UserDao userDao;

}
