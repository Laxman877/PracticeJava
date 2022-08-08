package model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adrid")
	int adrid;
	@Column(name = "street")
	String street;
	@Column(name = "city")
	String city;
	@Column(name = "state")
	String state;
	@Column(name = "zipcode")
	String zipcode;
	@OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
	Student student;
	
	public int getAdrid() {
		return adrid;
	}
	public void setAdrid(int adrid) {
		this.adrid = adrid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
