package com.java.record;

public class RecordDemo {

	public static void main(String[] args) {
		var person=new Person(1,"Ajeet","Dhanbad");
		System.out.println(person);
		System.out.println(person.personId());

	}

}
