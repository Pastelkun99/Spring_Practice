package com.project.service;

import com.project.dao.User;

public interface UserService {

	public int insertUserOne(User user);
	
	public User selectUserLogin(User user);
}
