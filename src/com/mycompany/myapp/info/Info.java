package com.mycompany.myapp.info;

public class Info {
	
	private String field;
	private String reference;
	
	public Info() {
		// TODO Auto-generated constructor stub
	}
	public Info(String f, String r) {
		field = f;
		reference = r;
	}
	
	public String get() {
		return field;
	}
	
	public String getRef() {
		return reference;
	}
}
