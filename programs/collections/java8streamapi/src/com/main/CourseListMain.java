package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseListMain {

	public static void main(String[] args) {
		
		List<String> courses = new ArrayList<>();
		courses.add("sql");
		courses.add("c++");
		courses.add("java");	
		courses.add(3,"python");
		courses.add("java advance");
		
		// how to get stream from collection object
		
		System.out.println("lenght of each string inside courses");
		courses.stream().map(c -> c.length()).forEach(n-> System.out.println(n));
		
		List<Integer> list = courses.stream().map(c -> c.length()).collect(Collectors.toList());
		
		System.out.println("lenght of each string inside courses which is greathan 5");
		courses.stream().map(c -> c.length()).filter(n-> n > 5).forEach(n-> System.out.println(n));

	}

}
