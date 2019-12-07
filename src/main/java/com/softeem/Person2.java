package com.softeem;

public class Person2 {
	
	private String name;
	private Integer age;
	private String cerNo;
	private String password;
	
	public Person2(String name, Integer age, String cerNo) {
		super();
		this.name = name;
		this.age = age;
		this.cerNo = cerNo;
	}
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCerNo() {
		return cerNo;
	}
	public void setCerNo(String cerNo) {
		this.cerNo = cerNo;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", cerNo=" + cerNo + ", password=" + password + "]";
	}
	
	
	
	

}
