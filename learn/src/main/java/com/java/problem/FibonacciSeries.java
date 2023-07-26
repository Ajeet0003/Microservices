package com.java.problem;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

	//0 1 1 2 3 5 8 13
	
	private static Map<Integer, Integer> cache=new HashMap<>();

	public static int fib(int pos) {
	if(pos==1)
		return 0;
	if(pos==2 || pos==3)
		return 1;
	
	if(cache.containsKey(pos)) {
		return cache.get(pos);
	}
		
	int result= fib(pos-1)+fib(pos-2);
	
	cache.put(pos,result);
	return result;
	}

	public static void main(String[] args) {
		long a=System.nanoTime();
		System.out.println(a);
		System.out.println(fib(20));
		long b=System.nanoTime();
		System.out.println(System.nanoTime());
		System.out.println(b-a);
//		System.out.println(a+"\n"+b);
//		for(int i=0;i<5;i++) {
//
//			c=a+b;
//			a=b;
//			b=c;
//			
//			System.out.println(c);
	}

}
