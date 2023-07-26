package com.java.enumDemo;

enum Laptop{
	Hp(43000), Lenovo(40000), dell(50000), Apple(90000),ThinPad;
	
	private int price;

	private Laptop() {
		
	}
	
	private Laptop(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class EnumClassDemo {

	public static void main(String[] args) {
		Laptop lap=Laptop.Apple;
		System.out.println(lap);
		System.out.println(lap.getPrice());
		
		for(Laptop l:Laptop.values() ) {
			System.out.println(l+" price "+l.getPrice());
		}

	}

}
