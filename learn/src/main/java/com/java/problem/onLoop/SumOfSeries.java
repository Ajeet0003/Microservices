package com.java.problem.onLoop;

import java.util.Scanner;

public class SumOfSeries {

	//1-2+3-4..
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int num= sc.nextInt();
		int ans=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0)
				ans-=i;
			else
				ans+=i;
		}
		System.out.println(ans);
		sc.close();
	}

}
