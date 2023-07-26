package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class withoutStream {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,6,2);
		System.out.println(nums);
		
		System.out.println(nums.size());
		int sum=0;
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i)%2==0) {
				sum=sum+nums.get(i)*2;
			}
		}
		int res=0;
		for(int n:nums) {
			if(n%2==0) {
				res=res+n*2;
			}
		}
		System.out.println(sum+" "+res);
		
		nums.forEach(n->System.out.println(n));
	}

}
