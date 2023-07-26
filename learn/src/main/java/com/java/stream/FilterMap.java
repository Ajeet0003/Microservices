package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMap {

	public static void main(String[] args) {
		List<Integer>  nums= Arrays.asList(1,3,5,6,7,8);
		
		Predicate<Integer> p=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer n) {
				
					return n%2==0;
			}
			
//			@Override
//			public boolean test(Integer n) {
//				if(n%2==0) {
//					return true;
//				}
//				else
//					return false;
//			}
		};
		
	Predicate<Integer> p1= n-> n%2==0;
			
//	Function<Integer, Integer> m= new Function<Integer, Integer>() {
//		
//		@Override
//		public Integer apply(Integer t) {
//			// TODO Auto-generated method stub
//			return t*2;
//		}
//	};	
	
	Function<Integer, Integer> m=  t -> t*2;
	
		int res=nums.stream().filter(p1).map(m).reduce(0,(c,e)->c+e);
		System.out.println(res);
		
		
//		int res=nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
//		System.out.println(res);
		
		
		Stream<Integer> sortedVaules=nums.stream().filter(n->n%2==0).sorted();
		sortedVaules.forEach(n->System.out.println(n));
		
		
	}

}
