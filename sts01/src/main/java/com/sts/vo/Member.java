package com.sts.vo;

import java.util.Arrays;

public class Member {

	private String mem_id = null;
	private String mem_pw = null;
	private String mem_name = null;
	private int mem_age = 0;
	private byte[] mem_img = null;
	private String mem_date = null;
	
	public Member() {
		super();
	}
	
	public Member(String mem_id, String mem_pw, String mem_name, int mem_age, byte[] mem_img, String mem_date) {
		super();
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_age = mem_age;
		this.mem_img = mem_img;
		this.mem_date = mem_date;
	}

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
	
	public int getMem_age() {
		return mem_age;
	}
	
	public void setMem_age(int mem_age) {
		this.mem_age = mem_age;
	}
	
	public byte[] getMem_img() {
		return mem_img;
	}
	
	public void setMem_img(byte[] mem_img) {
		this.mem_img = mem_img;
	}
	
	public String getMem_date() {
		return mem_date;
	}
	
	public void setMem_date(String mem_date) {
		this.mem_date = mem_date;
	}

	@Override
	public String toString() {
		return "Member [mem_id=" + mem_id + ", mem_pw=" + mem_pw + ", mem_name=" + mem_name + ", mem_age=" + mem_age
				+ ", mem_img=" + Arrays.toString(mem_img) + ", mem_date=" + mem_date + "]";
	}
	
	
	
}
