package com.jackie.maventest.dao;

import com.jackie.maventest.domain.User;

/**
 * 用户dao
 * 
 * @author Jackie Hou
 *
 */
public interface UserDao {
	void insert(User user);
	
	User selectByPrimaryKey(Integer id);
}
