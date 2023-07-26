package com.java.threads;

class A extends Thread {

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
class B  extends Thread{
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
public class ThreadDemo {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		//a.setPriority(10);
		//a.setPriority(Thread.MAX_PRIORITY);
		System.out.println(a.getPriority());
		a.start();
		b.start();
	}
}