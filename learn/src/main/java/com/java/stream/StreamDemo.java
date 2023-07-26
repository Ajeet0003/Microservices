package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(24, 5, 6, 77, 3);
//		Stream<Integer> s=nums.stream();

		// s.forEach(a->System.out.println(a));
		// s.forEach(a->System.out.println(a));

		Stream<Integer> s = nums.stream();
		Stream<Integer> s1 = s.filter(a -> a % 2 == 0);
		Stream<Integer> s2 = s1.map(a -> a * 2);
		int res = s2.reduce(0, (c, e) -> c + e);
		System.out.println(res);

//		int ress = nums.stream().filter(a -> a % 2 == 0).map(a -> a * 2).reduce(0, (c, e) -> c + e);
		int ress = nums.stream()
						.filter(a -> a % 2 == 0)
						.map(a -> a * 2)
						.reduce(0, (c, e) -> c + e);

		System.out.println(ress);
	}

}
