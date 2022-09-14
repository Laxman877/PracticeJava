package com.model;

import javax.persistence.*;

@Entity
@Table(name = "userData")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	String framework;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String email, String framework) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.framework = framework;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
}
