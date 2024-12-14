package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(25);
		nums.add(50);
		nums.add(29);
		nums.add(14);
		nums.add(19);
		nums.add(21);
		nums.add(48);
		
		//using iterator
		
		// using enhanced for loop
		
		//java 8; for-each loop
		nums.forEach(n-> System.out.print(n+" "));
		System.out.println();
		
		// even numbers
		System.out.println("Even Numbers");
		Iterator<Integer> i = nums.iterator();
		while(i.hasNext()) {
			int n = i.next();
			if(n%2==0) {
				System.out.print(n+" ");
			}
		}
		System.out.println();
		//using stream api
		System.out.println("Even numbers using stream api");
		nums.stream().filter(n-> n%2 == 0).forEach(x->System.out.print(x+" "));
		
		System.out.println();
		System.out.println("Odd numbers using stream api");
		nums.stream().filter(n-> n%2 != 0).forEach(x->System.out.print(x+" "));
		
		System.out.println("sum of all number"); 
		int sum = nums.stream().reduce((a,b)->a+b).get();
		System.out.println("Sum:"+ sum);
		

	}

}
