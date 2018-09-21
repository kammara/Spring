package com.java.ibm.springcrud;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")

public class Customer {

	@Id
	
	private Long id;
	
	
	private String name;
	

	private String email;
	
	
	private int mobile;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
}
