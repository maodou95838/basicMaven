package com.jackie.maventest.service;

import com.jackie.maventest.domain.User;

/**
 * 用户service接口
 * 
 * @author Jackie Hou
 *
 */
public interface UserService {
	void add(User user);
	
	User findById(User user);
}
