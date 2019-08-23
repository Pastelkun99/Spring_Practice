package com.sts.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Shop_MemberDAO implements Shop_MemberService {

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int insertMemberOne(Map<String, Object> map) {
		return sqlSession.insert("Shop_Member.insertMemberOne", map);
	}

	@Override
	public int insertMemberOneVo(Object vo) {
		return sqlSession.insert("Shop_Member.insertMemberOneVo", vo);
	}

	@Override
	public Map<String, Object> selectMemberLogin(Map<String, Object> map) {
		return sqlSession.selectOne("Shop_Member.selectMemberLogin", map);
	}
	// SELECT ID, NAME FROM SHOP_MEMBER WHERE ID=#{ } AND PW=#{};

	@Override
	public List<Map<String, Object>> selectMemberList() {
		return sqlSession.selectList("Shop_Member.selectMemberList");
	}

}
