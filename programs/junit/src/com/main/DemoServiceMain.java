package com.main;

import com.service.DemoService;

public class DemoServiceMain {

	public static void main(String[] args) {
		
		int input = 9; 
		
		DemoService demoService = new DemoService();
		demoService.primeCheck(input);
		
		//for input = 9 ; expected false
		
		//for input = 13; expected true
	}

}
