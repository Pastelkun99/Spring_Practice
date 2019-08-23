package com.project.dao;

public class User {

	private String user_id;
	private String user_pw;
	private String user_pw_confirm;
	private String user_motto;
	
	public User() {
		super();
	}

	public User(String user_id, String user_pw, String user_pw_confirm, String user_motto) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_pw_confirm = user_pw_confirm;
		this.user_motto = user_motto;
	}


	public String getUser_pw_confirm() {
		return user_pw_confirm;
	}

	public void setUser_pw_confirm(String user_pw_confirm) {
		this.user_pw_confirm = user_pw_confirm;
	}

	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_pw() {
		return user_pw;
	}
	
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
	public String getUser_motto() {
		return user_motto;
	}
	
	public void setUser_motto(String user_motto) {
		this.user_motto = user_motto;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_pw=" + user_pw + ", user_pw_confirm=" + user_pw_confirm
				+ ", user_motto=" + user_motto + "]";
	}

	
	
	
}
