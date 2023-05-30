package com.entity;

public class Profile {
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String contact;
	private String address;
	private String product;
	private String product_dtls;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile( String firstname, String lastname, String password, String email, String contact, String address, String product, String product_dtls) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.address = address;
		this.product = product;
		this.product_dtls = product_dtls;
		System.out.print(this.contact);
}
	
	public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getProduct() {
	return product;
}

public void setProduct(String product) {
	this.product = product;
}

public String getProduct_dtls() {
	return product_dtls;
}
public void setProduct_dtls(String product_dtls) {
	this.product_dtls = product_dtls;
}
}