package com.service;

public class Fruits {

	private String fruitName;
	private double fruitPrice;
	private boolean isInStock;
	public Fruits(String fruitName, double fruitPrice, boolean isInStock) {
		super();
		this.fruitName = fruitName;
		this.fruitPrice = fruitPrice;
		this.isInStock = isInStock;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public double getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(double fruitPrice) {
		this.fruitPrice = fruitPrice;
	}
	public boolean isInStock() {
		return isInStock;
	}
	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

}
