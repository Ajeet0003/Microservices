package com.java.threads;

//we can extends another class and also implements Runnable,
//we canot extends two class in java -multiple inheritance is not allowed
class AA implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BB implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class RunnableDemo {

	public static void main(String[] args) {
//		AA a = new AA();
//		BB b = new BB();
		Runnable a = new AA();
		Runnable b = new BB();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}