package com.sts.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sts.dao.Shop_ItemService;
import com.sts.vo.ShopItemVO;

@Controller
@RequestMapping(value = "/itm")
public class Shop_ItemController {
	
	@Autowired
	private Shop_ItemService iDAO;
	
	@RequestMapping(value = "/insertbatch.do", method = RequestMethod.GET)
	public String insertBatch2(Model model) {
		model.addAttribute("no", iDAO.selectItemNo()+1);
		model.addAttribute("list", iDAO.selectItemList());
		return "shop/insertbatch";
	}
	
	@RequestMapping(value = "/insertbatch.do", method = RequestMethod.POST)
	public String insertBatch(
			@RequestParam("itm_no[]") int[] itm_no,
			@RequestParam("itm_name[]") String[] itm_name,
			@RequestParam("itm_content[]") String[] itm_content,
			@RequestParam("itm_price[]") int[] itm_price,
			@RequestParam("itm_qty[]") int[] itm_qty) {

		List<ShopItemVO> list = new ArrayList<ShopItemVO>();
		for(int i=0; i<itm_no.length;i++) {
			list.add( new ShopItemVO(itm_no[i], itm_name[i], 
					itm_content[i], itm_price[i], itm_qty[i]) );
		}
		iDAO.insertItemBatch(list);
		
		return "redirect:insertbatch.do";
	}
	
	@RequestMapping(value = "/deletebatch.do", method = RequestMethod.POST)
	public String deleteBatch(@RequestParam("btn") String btn,
								@RequestParam(value = "chk[]", required = false) int[] chk_no,
								@RequestParam("itm_no[]") int[] itm_no,
								@RequestParam("itm_name[]") String[] itm_name,
								@RequestParam("itm_content[]") String[] itm_content,
								@RequestParam("itm_price[]") int[] itm_price,
								@RequestParam("itm_qty[]") int[] itm_qty) {
		
		if(btn.equals("일괄삭제")) {
			iDAO.deleteItemBatch(itm_no);
		}
		else if(btn.equals("일괄수정")) {
			List<ShopItemVO> list = new ArrayList<ShopItemVO>();
			for(int i=0; i<itm_no.length;i++) {
				list.add( new ShopItemVO(itm_no[i], itm_name[i], 
						itm_content[i], itm_price[i], itm_qty[i]) );
			}
			iDAO.updateItemBatch(list);
		}
		
		return "redirect:insertbatch.do";
	}
}
