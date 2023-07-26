package com.java.enumDemo;

enum option{
	Running, Dancing, Failed, Stop
}
public class SwitchCaseWithEnum {

	public static void main(String[] args) {

		option s=option.Dancing;
		
		switch (s) {
		case Dancing:
			System.out.println("All good");
			break;
		case Running:
			System.out.println("All not good");
			break;
		default:
			System.out.println("ok");
			break;
		}

	}

}
