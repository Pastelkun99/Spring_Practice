package com.sts.dao;

import java.util.List;

import com.sts.vo.Member;

public interface MemberService {

	public int insertMemberOne(Member mem);
	
	public List<Member> selectMemberList();
	
	public Member selectMemberImg(String id);
	
}
