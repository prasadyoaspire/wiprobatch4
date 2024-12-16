package com.service;

import java.util.Arrays;

public class DemoService {

	//if num is prime return true else return false
	public boolean primeCheck(int num) {
		
		for(int i=2;i<= num/2; i++) {
			if(num %i == 0)  {
				return false;
			}
		}		
		return true;
	}
	
	public int[] sortAry(int[] ary) {
		Arrays.sort(ary);
		return ary;
	}
}
