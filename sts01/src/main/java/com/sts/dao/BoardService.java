package com.sts.dao;

import java.util.List;
import java.util.Map;

public interface BoardService {

	public int updateBoardOne(Map<String, Object> map); //게시물 수정
	
	public List<Map<String, Object>> selectBoardList(); //게시물 목록
	
	public Map<String, Object> selectBoardOne(int no);  //게시물 내용
	
	public int insertBoardOne(Map<String, Object> map); //게시물 글쓰기
	
	public int updateBoardHit(int no); 	// 글번호가 넘어가면 조회수 1 증가
}
