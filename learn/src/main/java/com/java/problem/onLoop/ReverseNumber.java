package com.java.problem.onLoop;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		String num2 = sc.next();
		//int num = sc.nextInt();
		//String s=String.valueOf(num);
		int[] arr=new int[num2.length()];
		int num1=Integer.parseInt(num2);
		//System.out.println(num1);
		int r=0;
		for(int i=0; i<arr.length;i++) {
			
			arr[i]=num1%10;
			num1=num1/10;
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		
		
//		int r=0;
//		while(num>0) {
//			r=num%10;
//			num=num/10;
//			System.out.print(r);
//		}

	}

}
