package com.service;

public class FruitOutOfStockException extends Exception {

	public FruitOutOfStockException(String message) {
		super(message);
	}
}