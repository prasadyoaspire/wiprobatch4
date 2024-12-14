package collectionapp;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductListDemo {

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
		
		ArrayList<Product> myProducts = new ArrayList<>();		
		myProducts.add(product1);
		myProducts.add(product2);
		myProducts.add(product3);
		myProducts.add(product4);
		myProducts.add(product5); //duplicates are allowed
		
		System.out.println(myProducts);
		
		Iterator<Product> i = myProducts.iterator();
		while(i.hasNext()) {
			Product product = i.next();
			System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice()+" "+product.getCategory());
		}
	}
}
