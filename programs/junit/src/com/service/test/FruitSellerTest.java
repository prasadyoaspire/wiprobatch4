package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.service.Customer;
import com.service.FruitOutOfStockException;
import com.service.FruitSeller;
import com.service.Fruits;
import com.service.InsufficientBalanceException;

public class FruitSellerTest {
	
	@Test
	void testPurchaseFruitWithOutOfStockExcepiton() {
		
		Fruits f = new Fruits("apple",500, false);
		Customer c = new Customer(1000);		
		FruitSeller fs = new FruitSeller();
		
		Exception ex = assertThrows(FruitOutOfStockException.class, () -> fs.purchaseFruit(f, c));
		
		String expected = "Fruit out of stock";
		String actual  = ex.getMessage();
		
		assertEquals(expected,actual);		
	}
	
	@Test
	void testPurchaseFruitWithInsufficientExcepiton() {
		
		Fruits f = new Fruits("apple",500, true);
		Customer c = new Customer(300);		
		FruitSeller fs = new FruitSeller();
		
		Exception ex = assertThrows(InsufficientBalanceException.class, () -> fs.purchaseFruit(f, c));
		
		String expected = "Insufficient balance, add money to the wallet!";
		String actual  = ex.getMessage();
		
		assertEquals(expected,actual);		
	}
	
	@Test
	void testPurchaseFruitWithOutExcepiton() throws FruitOutOfStockException, InsufficientBalanceException {
		
		Fruits f = new Fruits("apple",500, true);
		Customer c = new Customer(1000);		
		FruitSeller fs = new FruitSeller();
		String actual = fs.purchaseFruit(f, c);
		String expected = "Order Placed";
		
		assertEquals(expected,actual);		
	}

}
