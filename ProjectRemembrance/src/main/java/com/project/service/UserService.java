package com.project.service;

import com.project.dao.User;

public interface UserService {

	public int insertUserOne(User user);
	
	public User selectUserLogin(User user);
	
	public User selectUserOne(User user);
	
	public User selectUserAll(String id);
	
	public int updateUserOne(User user);
	
	public int deleteUserOne(String id);
}
