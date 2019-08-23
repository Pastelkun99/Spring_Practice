package com.sts.dao;

import java.util.List;
import java.util.Map;

public interface Shop_MemberService {

	public int insertMemberOne(Map<String, Object> map);
	
	public int insertMemberOneVo(Object vo);
	
	// id와 암호를 map에 추가한 후 map(id, name) 리턴하게 만듦
	public Map<String, Object> selectMemberLogin(Map<String, Object> map);
	
	public List<Map<String, Object>> selectMemberList();
}
