package model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stid")
	int stid;
	@Column(name = "std_name")
	String std_name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adrid")
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return stid;
	}
	public void setId(int id) {
		this.stid = id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
}
