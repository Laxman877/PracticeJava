package org;

public class Address {
	
	int aid;
	String city;
	String state;
	String country;
	
	public void display() {
		System.out.println("aid= "+aid + " "+"city= "+city+" "+"state= "+state+" "+"country= " +country);
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
