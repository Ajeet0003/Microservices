package com.java.record;

public record Person(int personId,String name,String address) {

	/**
	 * it is special type of class which help to create data carrying object
	 * By record we can make getter, toString ,hashcode,toequals by automatic
	 * it is immutable
	 * no need to make getters ,....
	 * records are final that no other class extends that record
	 */
}
