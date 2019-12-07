package com.softeem;

public class Person {
	
	private String name;
	private Integer age;
	private String cerNo;
	private Integer id;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, Integer age, String cerNo,Integer id) {
		super();
		this.name = name;
		this.age = age;
		this.cerNo = cerNo;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Person [name=" + name + ", age=" + age + ", cerNo=" + cerNo + ", id=" + id + "]";
	}

	
	
	
	

}
