package com.java.problem.onLoop;

import java.util.Scanner;

public class Factorial {

//	public static int fact(int a) {
//		int res=1;
//		for (int i = 1; i <=a; i++) {
//			res=res*i;
//		}
//		return res;
//	}
//	
	public static int fact(int a) {
	
		if(a==0)
			return 1;
		return a*fact(a-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int num = sc.nextInt();
		
		System.out.println(fact(num));

	}

}
