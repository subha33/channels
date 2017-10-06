package com.Service;

public class CustomerPojo {

	public String fname;
	public String lname;
	public String age;
	
	public CustomerPojo(String fname, String lname, String age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
