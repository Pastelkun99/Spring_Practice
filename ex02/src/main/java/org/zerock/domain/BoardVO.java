package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	// Oracle에 존재하는 테이블의 컬럼을 그대로 가져옴.
	// 이거 DTO에서 만들지 않나?
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	
}
