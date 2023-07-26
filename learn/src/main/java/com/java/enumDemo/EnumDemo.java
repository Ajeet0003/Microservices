package com.java.enumDemo;

enum Status{
	Running, Dancing, Failed, Stop
}


public class EnumDemo {

	public static void main(String[] args) {
		Status s=Status.Dancing;
		System.out.println(s);
		System.out.println(s.ordinal());
		
		Status[] ss=Status.values();
		
		for(Status s1:ss) {
			System.out.println(s1);
		}

		
	}

}
