package com.sts.vo;

public class Shop_Member {

	private String mem_id;
	private String mem_pw;
	private String mem_name;
	private String mem_phone;
	private String mem_addr;
	private String mem_date;
	private int mem_grade;
	
	public String getMem_id() {
		return mem_id;
	}
	
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
	public String getMem_pw() {
		return mem_pw;
	}
	
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	
	public String getMem_name() {
		return mem_name;
	}
	
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	
	public String getMem_phone() {
		return mem_phone;
	}
	
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	
	public String getMem_addr() {
		return mem_addr;
	}
	
	public void setMem_addr(String mem_addr) {
		this.mem_addr = mem_addr;
	}
	
	public String getMem_date() {
		return mem_date;
	}
	
	public void setMem_date(String mem_date) {
		this.mem_date = mem_date;
	}
	
	public int getMem_grade() {
		return mem_grade;
	}
	
	public void setMem_grade(int mem_grade) {
		this.mem_grade = mem_grade;
	}

	@Override
	public String toString() {
		return "Shop_Member [mem_id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_name=" + mem_name + ", mem_phone="
				+ mem_phone + ", mem_addr=" + mem_addr + ", mem_date=" + mem_date + ", mem_grade=" + mem_grade + "]";
	}
	
	
	
	
}
