package com.java.problem;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int numRows = 7; // Specify the number of rows in the triangle

		        for (int i = 0; i < numRows; i++) {
		            int number = 1; // Initialize the first number in each row
		            System.out.format("%" + (numRows - i) * 2 + "s", ""); // Adjust indentation for each row

		            for (int j = 0; j <= i; j++) {
		                System.out.format("%4d", number); // Print the current number

		                number = number * (i - j) / (j + 1); // Calculate the next number
		            }

		            System.out.println(); // Move to the next row
		        }
		    }
		


	}


