package com;

import org.springframework.stereotype.Component;

@Component
public class BasicInfo implements CustomerDeatils{
	int id;
	String name;
	
	public BasicInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void getBasicInfo() {
		System.out.println(id+" "+name);
	}

}
