package com.java;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String course;
	transient private String gender;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	public Employee(String name, int age, String course, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
		this.gender = gender;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
