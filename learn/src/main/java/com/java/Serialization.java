package com.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		try {
			// create object of employee
			Employee employee = new Employee("Ajeet", 27, "java", "M");

			// write data to file
			FileOutputStream fos = new FileOutputStream("emp.txt");

			// in to byte stream
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// how to serialize
			oos.writeObject(employee);

			oos.close();
			fos.close();
			System.out.println("Object state transfered to file emp.txt");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
