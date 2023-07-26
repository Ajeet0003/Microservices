package com.java.problem;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println("number is "+num);
//		int count=1;
//		while(num/10!=0) {
//			num=num/10;
//			count++;
//		}

//		int count=0;
//		do {
//			num=num/10;
//			count++;
//		}while(num>0);
		
		int originalNum=num;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		
		System.out.println("Number of digit in "+originalNum+" is "+count);
		sc.close();
	}

}
