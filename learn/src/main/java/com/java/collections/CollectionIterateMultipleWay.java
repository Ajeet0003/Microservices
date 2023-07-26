package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionIterateMultipleWay {

	public static void main(String[] args) {
		List<String> name= new ArrayList<>();
		name.add("Ajeet");
		name.add("kumar");
		name.add("Sujit");
		name.add("Kumar");
		
		System.out.println("++++++++Enhanced for loop+++++++++");
		for(String str:name) {
			System.out.println(str);
		}
		System.out.println("+++++++for loop++++++++++");
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		System.out.println("++++++Iterator+++++++++++");
		Iterator<String> itr=name.iterator();
		while(itr.hasNext()) {
			String nm=itr.next();
			System.out.println(nm);
		}
		System.out.println("+++++++++ListIterator++++++++");
		ListIterator<String> itr1=name.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("++++++ListIterator reverse+++++++");
		ListIterator<String> rev =name.listIterator(name.size());
		while(rev.hasPrevious()) {
			System.out.println(rev.previous());
		}
		System.out.println("+++++ForEach Loop++++++++++");
		name.forEach(d->{
			System.out.println(d);
		});
		
		System.out.println("++++++Stream+++++++++++");
		name.stream().forEach(e->{
			System.out.println(e);
		});
		
	}

}
