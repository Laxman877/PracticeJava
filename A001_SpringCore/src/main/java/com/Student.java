package com;

import java.util.List;

public class Student {
	int id;
	String name;
	String dept;
	List<String> sub;
	List<String> lang;
	List<Address> adr;
	Stream str;
	
	public Stream getStr() {
		return str;
	}
	public void setStr(Stream str) {
		this.str = str;
	}
	public List<String> getLang() {
		return lang;
	}
	public void setLang(List<String> lang) {
		this.lang = lang;
	}
	public List<String> getSub() {
		return sub;
	}
	public void setSub(List<String> sub) {
		this.sub = sub;
	}
	public List<Address> getAdr() {
		return adr;
	}
	public void setAdr(List<Address> adr) {
		this.adr = adr;
	}
	public void display() {
		System.out.println(id+" "+name+" "+dept);
		System.out.println("********");
		for(Address a:adr) {
			a.display();
		}
		System.out.println("**********");
		for(String s:sub) {
			System.out.println(s);
		}
		System.out.println("**********");
		for(String l:lang) {
			System.out.println(l);
		}
		System.out.println("**********");
		str.display();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
