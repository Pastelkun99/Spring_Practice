package com.sts.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.vo.ShopItemVO;

@Service
public class Shop_ItemDAO implements Shop_ItemService {

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public int selectItemNo() {
		return sqlSession.selectOne("Shop_Item.selectItemNo");
	}

	@Override
	public int insertItemBatch(List<ShopItemVO> list) {
		return sqlSession.insert("Shop_Item.insertItemBatch", list);
	}

	@Override
	public List<ShopItemVO> selectItemList() {
		return sqlSession.selectList("Shop_Item.selectItemList");
	}

	@Override
	public int deleteItemBatch(int[] itm_no) {
		return sqlSession.delete("Shop_Item.deleteItemBatch", itm_no);
	}

	@Override
	public int updateItemBatch(List<ShopItemVO> list) {
		return sqlSession.insert("Shop_Item.updateItemBatch", list);
	}

}
