package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.bean.Product;

public class ProductMain {

	public static void main(String[] args) {
		
		Product product1 = new Product(10,"IphoneX",85000,"mobile");		
		Product product2 = new Product(20,"DellXP",120000,"laptop");	
		Product product3 = new Product(30,"IphoneY",95000,"mobile");		
		Product product4 = new Product(40,"SonyE26",65000,"headphone");
		Product product5 = new Product(50,"IphoneZ",95000,"mobile");
		Product product6 = new Product(60,"Mac25",250000,"laptop");
		
		
		ArrayList<Product> myProducts = new ArrayList<>();		
		myProducts.add(product1);
		myProducts.add(product2);
		myProducts.add(product3);
		myProducts.add(product4);
		myProducts.add(product5);
		myProducts.add(product6);
		
		//task : filter products based on user input
		
		String input = "laptop";
		
		//without stream api
		for(Product p: myProducts) {
			if(p.getCategory().equals(input)) {
				System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory());
			}
		}
		
		System.out.println("With stream api");
		//with stream api		
		myProducts.stream().filter(p->p.getCategory().equals(input)).forEach(p->System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice()+" "+p.getCategory()));

	    // sum of all prices
		float sumOfPrices = myProducts.stream().map(p-> p.getProductPrice()).reduce((a,b)->a+b).get();
		System.out.println("Sum of all product price: "+sumOfPrices);
		
		//collect all product with mobile category in a separate set
		Set<Product> mobileSet = myProducts.stream().filter(p->p.getCategory().equals("mobile")).collect(Collectors.toSet());
		
		//collect all product names with mobile category in a sperate list
		List<String> productNamesList = myProducts.stream().filter(p->p.getCategory().equals("mobile")).map(m-> m.getProductName()).collect(Collectors.toList());
	}

}
