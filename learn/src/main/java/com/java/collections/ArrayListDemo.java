package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {

		Collection nums = new ArrayList();

		// here nums is object, no index
		nums.add(1);
		nums.add(3);
		nums.add(5);
		nums.add(6);
		nums.add("2");
		System.out.println(nums);

		for (Object n : nums) {
			System.out.println(n);
		}

		// 2
		Collection<Integer> nums1 = new ArrayList<Integer>();

		nums1.add(1);
		nums1.add(3);
		nums1.add(5);
		nums1.add(6);
		// nums.add("2");
		System.out.println(nums1);

		for (Object n : nums1) {
			System.out.println(n);
		}

		// 3
		List<Integer> nums2 = new ArrayList<Integer>();

		// here duplicate value added
		nums2.add(1);
		nums2.add(3);
		nums2.add(5);
		nums2.add(6);
		nums2.add(5);

		System.out.println(nums2);
		System.out.println(nums2.indexOf(3));
		for (int n : nums2) {
			System.out.println(n);
		}
		// 4
		Set<Integer> nums3 = new HashSet<Integer>();

		// here duplicate value not allowed, index is not here
		nums3.add(1);
		nums3.add(3);
		nums3.add(5);
		nums3.add(6);
		nums3.add(5);

		System.out.println(nums3);

		for (int n : nums3) {
			System.out.println(n);
		}

		// 5
		Set<Integer> nums4 = new TreeSet<Integer>();

		// here duplicate value not allowed, index is not here,sorted
		nums4.add(1);
		nums4.add(3);
		nums4.add(5);
		nums4.add(6);
		nums4.add(5);

		System.out.println(nums4);

		for (int n : nums4) {
			System.out.println(n);
		}
	}

}
