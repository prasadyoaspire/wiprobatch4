package com.service;

public class CalculatorService {

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public int div(int a , int b) {
		int c = a/b;
		return c;
	}
	
	public int convert(String s) {
		int n = Integer.parseInt(s);
		return n;
	}
}
