package com.service;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
