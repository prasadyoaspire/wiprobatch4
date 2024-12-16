package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.service.CalculatorService;
import com.service.DemoService;

public class ParametierizedTestDemo {
	
	@ParameterizedTest
	@ValueSource ( ints = { 7,13,31})
	void testPrimeValues(int a) {
		DemoService demoService = new DemoService();
		boolean actualResult = demoService.primeCheck(a);
		assertTrue(actualResult);
	}
	
	@ParameterizedTest
	@ValueSource ( ints = { 20,15,25,64})
	void testNonPrimeValues(int a) {
		DemoService demoService = new DemoService();
		boolean actualResult = demoService.primeCheck(a);
		assertFalse(actualResult);
	}

	@ParameterizedTest
	@CsvSource ({ "25,25,50", "-50,-50,-100", "-100,200,100"})
	void testAddWithParams(int a, int b,int expectedResult) {
		CalculatorService calService = new CalculatorService();
		int actualResult = calService.add(a, b);
		assertEquals(expectedResult,actualResult);
	}
}
