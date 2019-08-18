package com.sts.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.vo.Member;

@Service
public class MemberDAO implements MemberService {

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int insertMemberOne(Member mem) {
		return sqlSession.insert("memberMapper.insertMemberOne", mem);
	}

	@Override
	public List<Member> selectMemberList() {
		return sqlSession.selectList("memberMapper.selectMemberList");
	}

	@Override
	public Member selectMemberImg(String id) {
		return sqlSession.selectOne("memberMapper.selectMemberImg", id);
	}

}
