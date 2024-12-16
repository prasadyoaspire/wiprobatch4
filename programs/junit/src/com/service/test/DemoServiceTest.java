package com.service.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.service.DemoService;

public class DemoServiceTest {
	
	@Test
	void testPrimeCheck() {		
		DemoService demoService = new DemoService();
		boolean actualResult = demoService.primeCheck(13);		
		//assertEquals(true,actualResult);		
		assertTrue(actualResult);		
	}
	
	@Test
	void testNonPrimeCheck() {		
		DemoService demoService = new DemoService();
		boolean actualResult = demoService.primeCheck(12);		
		//assertEquals(false,actualResult);		
		assertFalse(actualResult);		
	}
	
	@Test
	void testSort() {
		DemoService demoService = new DemoService();
		int[] inputAry = {25,36,41,10,72,55};
		int[] actual = demoService.sortAry(inputAry);		
		int[] expected = {10,25,36,41,55,72};		
		assertArrayEquals(expected, actual);
	}
}
