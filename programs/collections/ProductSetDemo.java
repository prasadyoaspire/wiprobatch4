package collectionapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProductSetDemo {

	public static void main(String[] args) {
		
		Product product1 = new Product(10,"IphoneX",85000,"mobile");
		
		Product product2 = new Product();
		product2.setProductId(20);
		product2.setProductName("DellXP");
		product2.setProductPrice(120000);
		product2.setCategory("laptop");
		
		Product product3 = new Product(30,"IphoneY",95000,"mobile");		
		Product product4 = new Product(40,"SonyE26",65000,"headphone");
		Product product5 = new Product(10,"IphoneX",85000,"mobile");
		
		//HashSet<Product> myProducts = new HashSet<>();	// unordered and unsorted	
		
		//LinkedHashSet<Product> myProducts = new LinkedHashSet<>(); //ordered
		
		TreeSet<Product> myProducts = new TreeSet<>(); //sorted		
		myProducts.add(product4);
		myProducts.add(product2);
		myProducts.add(product1);
		myProducts.add(product3);	
		myProducts.add(product5); // duplicate object. set ignores duplicates
		
		Iterator<Product> i = myProducts.iterator();
		while(i.hasNext()) {
			Product product = i.next();
			System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice()+" "+product.getCategory());
		}
	}
}
