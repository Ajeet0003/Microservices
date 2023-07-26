package com.java;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String str) {
		super(str);
		System.out.println("jhgj");
	}

	public MyException() {

	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 1;
			int r = a / b;
			System.out.println(r);
			if (r == 0)
				throw new ArithmeticException("Hi bro");
			if (r == 1)
				throw new MyException("My ex Args");

		} catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println("bye");
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("or sab theek");
	}

}
