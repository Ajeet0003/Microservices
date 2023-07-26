package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLooop {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 6, 67, 3);

		Consumer<Integer> con = new Consumer<Integer>() {
			public void accept(Integer a) {
				System.out.println(a);
			}
		};

		nums.forEach(con);
		
		Consumer<Integer> cons =a ->System.out.println(a);
			

		nums.forEach(cons);
		nums.forEach(a->System.out.println(a));
	}

}
