package com.application.model;

public class Student {

	private String name;
	private int age;
	private String email;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student(String name, int age, String email, String country) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}

}
