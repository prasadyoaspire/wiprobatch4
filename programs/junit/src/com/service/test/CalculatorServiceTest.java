package com.service.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.service.CalculatorService;

public class CalculatorServiceTest {
	
	CalculatorService calService;
	
	@BeforeAll
	static void init() {
		System.out.println("Before all test methods");
	}
	
	@AfterAll
	static void close() {
		System.out.println("After all test methods");
	}
	
	@BeforeEach
	void setUp() {
		calService = new CalculatorService();
		System.out.println("BeforeEach method");
	}
	
	@AfterEach
	void tearDown() {
		calService = null;
		System.out.println("AfterEach method");
	}
	

	@Test
	public void testAdd() {		
		//CalculatorService calService = new CalculatorService();
		int actualResult = calService.add(100, 200);		
		assertEquals(300,actualResult);
	}
	
	@Test
	public void testTwoNagativeAdd() {		
		//CalculatorService calService = new CalculatorService();
		int actualResult = calService.add(-100, -200);		
		assertEquals(-300,actualResult);
	}
	
	@Disabled
	@Test
	public void testOneNagativeAdd() {		
		//CalculatorService calService = new CalculatorService();
		int actualResult = calService.add(-100, 200);		
		assertEquals(100,actualResult);
	}
	
	@Test
	void testDiv() {
		int result = calService.div(50, 10);
		assertEquals(5,result);
	}
	
	@Test
	void testDivWithException() {
		assertThrows(ArithmeticException.class, ()-> calService.div(50,0));	
	}
	
	@Test
	void testCovert() {
		int result = calService.convert("20");		
		assertEquals(20,result);
	}
	
	@Test
	void testCovertWithException() {		
		Exception ex = assertThrows(NumberFormatException.class, ()-> calService.convert("abc"));	
		String expectedMsg = "For input string";
		String actualMsg = ex.getMessage();
		System.out.println(actualMsg);
		assertTrue(actualMsg.contains(expectedMsg));
	}	
}
