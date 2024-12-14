package com.bean;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class LambdaDemo {

	public static void main(String[] args) {
		
//		ICalculator ical = (n) -> {
//		int result = n*n*n;
//		return result;
//		};
		
		ICalculator ical = n -> n*n*n;
		
		int result = ical.cube(3);		
		System.out.println("Cube: "+result);
		
		IAddition iaddtion = (x,y) -> x+y;		
		int sum = iaddtion.sum(20, 30);
		System.out.println("Sum: "+sum);
		
		//IDemoInterface idemo = s -> System.out.println("Hello :"+s);
		//idemo.test("Raj");
		
		Consumer<String> consumer = s -> System.out.println("Hello :"+s);
		consumer.accept("rohit sharma");
		
		BinaryOperator<Integer> bo = (a,b) -> a+b;
		int sumOfValues = bo.apply(100, 200);
		System.out.println(sumOfValues);
		
	}

}
