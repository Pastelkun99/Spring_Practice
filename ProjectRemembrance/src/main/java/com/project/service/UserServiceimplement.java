package com.project.service;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.User;

@Service
public class UserServiceimplement implements UserService{

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int insertUserOne(User user) {
		return sqlSession.insert("userMapper.insertUserOne", user);
	}

	@Override
	public User selectUserLogin(User user) {
		return sqlSession.selectOne("userMapper.selectUserLogin", user);
	}

}
