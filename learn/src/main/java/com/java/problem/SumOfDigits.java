package com.java.problem;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int onum=num;
		int r=0;
		while(num!=0) {
			 r=r+num%10;
			 num=num/10;
		}
		System.out.println("Sum of number "+onum+ " is "+ r);
		sc.close();
	}

}
