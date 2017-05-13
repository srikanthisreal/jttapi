package com.stech.jttapi;

import java.io.Serializable;

public class Address implements Serializable{
	
	private static final long serialVersionUID = 285000543644571863L;
	public String address1;
	public String address2;
	public String address3;
	
	public Address(){
		
	}
	
	public Address(String address1, String address2, String address3) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	
	

}
