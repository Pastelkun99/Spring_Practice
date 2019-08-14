package com.sts.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardDAO implements BoardService {
	
	//mapper 객체 <= mybatis-context.xml의 마지막 bean객체
	@Autowired
	//@Resource(name = "sqlSession")
	private SqlSession sqlSession;
	

	@Override
	public int insertBoardOne(Map<String, Object> map) {
		return sqlSession.insert("boardMapper.insertBoardOne", map);
	}


	@Override
	public int updateBoardOne(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<Map<String, Object>> selectBoardList() {
		return sqlSession.selectList("boardMapper.selectBoardList");
	}


	// 게시물 출력
	@Override
	public Map<String, Object> selectBoardOne(int no) {
		return sqlSession.selectOne("boardMapper.selectBoardOne", no);
	}


	@Override
	public int updateBoardHit(int no) {
		return sqlSession.update("boardMapper.updateBoardHit", no);
	}
		
}
