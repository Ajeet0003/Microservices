package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryBlock {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReader bf = null;
//		try {
//			InputStreamReader in=new InputStreamReader(System.in);
//			bf=new BufferedReader(in);
//			System.out.println(Integer.parseInt(bf.readLine()));
//		}
		// Approach 2 , here no need to close bf here by try block it close
		// automatically
		try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.println(Integer.parseInt(bf.readLine()));

//		finally {
//			bf.close();
//			System.out.println("Bye");
//		}
		}

	}
}
