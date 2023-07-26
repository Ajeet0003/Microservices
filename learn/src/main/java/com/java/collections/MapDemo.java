package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> nums=new HashMap<>();
		nums.put("Aj", 1);
		nums.put("Aje", 2);
		nums.put("Ajee", 31);
		nums.put("Ajeet", 61);
		
		System.out.println(nums);
		System.out.println(nums.get("Aj"));
		
		for (String n:nums.keySet()) {
			System.out.println(n +" " +nums.get(n));
		}
		

	}

}
