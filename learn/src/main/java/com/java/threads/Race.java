package com.java.threads;

//we can extends another class and also implements Runnable,
//we canot extends two class in java -multiple inheritance is not allowed

//class BBa implements Runnable {
//	public void run() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("hello");
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//}

class  Counter{
	int count=0;
	public synchronized void increament() {
		count++;
	}
}

public class Race {

	public static void main(String[] args) throws InterruptedException {
//		AA a = new AA();
//		BB b = new BB();
		Counter obj=new Counter();
		// we can apply lambda ex on Functional interface which has only one method
		Runnable a = () -> {

			for (int i = 0; i < 1000; i++) {
				
				obj.increament();
			}
		};
		Runnable b = () -> {

			for (int i = 0; i < 1000; i++) {
				obj.increament();
			}
		};

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(obj.count);
	}
}