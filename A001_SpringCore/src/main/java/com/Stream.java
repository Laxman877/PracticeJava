package com;

public class Stream {
	String code;
	String name;
	
	public void display() {
		System.out.println(code+" "+name);
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
