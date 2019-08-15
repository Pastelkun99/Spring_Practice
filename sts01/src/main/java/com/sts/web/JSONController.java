package com.sts.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.dao.BoardService;

@RestController
public class JSONController {
	
	@Autowired
	private BoardService bDAO;

	// 127.0.0.1:8080/web/board.json
	@RequestMapping(value = "/board.json", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Map<String, Object>> board() {
		
		List<Map<String, Object>> list = bDAO.selectBoardList();
		// CROB 데이터에 대한 처리
		// 한개는 가능하지만, 여러개는 반환이 안된다.
		// 여러개를 반환처리하고 싶으면 배열 형태로 바뀐다.
		return list;
	}
	
	@RequestMapping(value = "/boardd.json", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Map<String, Object> boardd(@RequestParam("no") int no) {
		int ret = bDAO.deleteBoardOne(no);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ret", ret);
		return map;
	}
	
}
