package com;

import org.springframework.stereotype.Component;

@Component
public class AddressInfo implements CustomerDeatils {
	String city;
	String pin;
	
	public AddressInfo(String city, String pin) {
		super();
		this.city = city;
		this.pin = pin;
	}

	public void getBasicInfo() {
		System.out.println(city+" "+pin);
	}

}
