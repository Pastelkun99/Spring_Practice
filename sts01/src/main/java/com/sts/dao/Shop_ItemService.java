package com.sts.dao;

import java.util.List;

import com.sts.vo.ShopItemVO;

public interface Shop_ItemService {

	public int selectItemNo();
	
	public int insertItemBatch(List<ShopItemVO> list);
	
	public List<ShopItemVO> selectItemList();
	
	public int deleteItemBatch(int[] itm_no);

	public int updateItemBatch(List<ShopItemVO> list);
	
}
