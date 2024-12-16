package com.service;

public class Customer {

	private double walletBalance;

	public Customer(double walletBalance) {
		super();
		this.walletBalance = walletBalance;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}	
}
