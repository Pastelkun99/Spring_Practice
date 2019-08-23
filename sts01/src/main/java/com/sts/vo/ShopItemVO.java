package com.sts.vo;

public class ShopItemVO {

	private int itm_no;
	private String itm_name;
	private String itm_content;
	private int itm_price;
	private int itm_qty;
	
	
	public ShopItemVO() {
		super();
	}

	public ShopItemVO(int itm_no, String itm_name, String itm_content, int itm_price, int itm_qty) {
		super();
		this.itm_no = itm_no;
		this.itm_name = itm_name;
		this.itm_content = itm_content;
		this.itm_price = itm_price;
		this.itm_qty = itm_qty;
	}

	public int getItm_no() {
		return itm_no;
	}

	public void setItm_no(int itm_no) {
		this.itm_no = itm_no;
	}

	public String getItm_name() {
		return itm_name;
	}

	public void setItm_name(String itm_name) {
		this.itm_name = itm_name;
	}

	public String getItm_content() {
		return itm_content;
	}

	public void setItm_content(String itm_content) {
		this.itm_content = itm_content;
	}

	public int getItm_price() {
		return itm_price;
	}

	public void setItm_price(int itm_price) {
		this.itm_price = itm_price;
	}

	public int getItm_qty() {
		return itm_qty;
	}

	public void setItm_qty(int itm_qty) {
		this.itm_qty = itm_qty;
	}

}
