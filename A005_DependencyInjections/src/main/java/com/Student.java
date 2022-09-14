package com;

public class Student {
	int sid;
	String name;
	String stream;
	public Student(int sid, String name, String stream) {
		super();
		this.sid = sid;
		this.name = name;
		this.stream = stream;
	}
	public void display() {
		System.out.println(sid+" "+name+" "+stream);
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
}
