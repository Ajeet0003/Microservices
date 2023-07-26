package com.java;

import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number");
		// 1 Approach
//		int n = System.in.read();// its giving Ascii value
//		System.out.println(n);
//		System.out.println(n - 48);
//
//		System.out.println("++++++++++");
		// if we want to print without Ascii value then we have go with BufferedReader

		// 2 Approach
//		InputStreamReader in=new InputStreamReader(System.in);
//		BufferedReader bf=new BufferedReader(in);
//		
//		int a=Integer.parseInt(bf.readLine());
//		//int a=bf.read();// its giving ascii value
//		System.out.println(a);
//		bf.close();

		// 3 Approach
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt());
		sc.close();

	}

}
