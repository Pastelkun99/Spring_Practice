package com.sts.vo;

import java.util.ArrayList;
import java.util.List;

public class MavVO {
	private String id = null;
	private String language = null;
	private List<String> lang1 = new ArrayList<String>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public List<String> getLang1() {
		return lang1;
	}
	
	public void setLang1(List<String> lang1) {
		this.lang1 = lang1;
	}
	
	@Override
	public String toString() {
		return "MavVO [id=" + id + ", language=" + language + ", lang1=" + lang1 + "]";
	}
	

	
	
	
	
}
