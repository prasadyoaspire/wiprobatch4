package com.main;

import java.util.ArrayList;
import java.util.List;

public class MethodRefDemo {

	public static void main(String[] args) {
		
		List<String> courses = new ArrayList<>();
		courses.add("sql");
		courses.add("c++");
		courses.add("java");	
		courses.add(3,"python");
		courses.add("java advance");
		
		//courses.forEach(c-> System.out.println(c));
		
		courses.forEach(System.out :: println);

	}
}
