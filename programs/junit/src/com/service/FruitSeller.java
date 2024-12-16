package com.service;

public class FruitSeller {

	 public String purchaseFruit(Fruits f, Customer c) throws FruitOutOfStockException, InsufficientBalanceException {

		// 1. Throw FruitOutOfStockException when the fruit is out of stock with the message "Fruit out of stock".
		 if(!f.isInStock()) {
			 throw new FruitOutOfStockException("Fruit out of stock");
		 }

		 //2. Throw an InsufficientBalanceException when customer wallet balance is not sufficient (Item price is greater than the wallet balance) with the message "Insufficient balance, add money to the wallet!".
		 if(c.getWalletBalance() < f.getFruitPrice()) {
			 throw new InsufficientBalanceException("Insufficient balance, add money to the wallet!");
		 }
		 
		 //3. If no exception found return "Order Placed".
		 return "Order Placed";

	  }

}
