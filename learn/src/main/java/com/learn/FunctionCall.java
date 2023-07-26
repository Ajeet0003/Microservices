package com.learn;

public class FunctionCall {

	public boolean test() {
		System.out.println("hi");
		return true;
	}

	public static void main(String[] args) {
		FunctionCall v=new FunctionCall();
		if(v.test()) {
			System.out.println("hello");
			
		}
		
	}

}
