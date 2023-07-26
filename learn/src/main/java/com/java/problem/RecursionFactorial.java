package com.java.problem;

public class RecursionFactorial {

	int res = 1;

//	int fact(int f) {
//		while (f > 0) {
//			res = res * f--;
//			
//		}
//
//		return res;
//	}

	int fact(int f) {
		//res=res* fact(f--);

		if (f==0)
			return 1;
		return f*fact(f-1);
	}
	
	public static void main(String[] args) {

		RecursionFactorial o = new RecursionFactorial();
		System.out.println(o.fact(5));

	}

}
