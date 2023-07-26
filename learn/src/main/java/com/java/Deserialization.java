package com.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("emp.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee employee = (Employee) ois.readObject();
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
			System.out.println(employee.getCourse());
			System.out.println(employee.getGender());
			System.out.println(employee.toString());
			ois.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
