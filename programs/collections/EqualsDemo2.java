package collectionapp;

public class EqualsDemo2 {

	public static void main(String[] args) {
		
		Product product1 = new Product(10,"IphoneX",85000,"mobile");
		Product product3 = new Product(30,"IphoneY",95000,"mobile");	
		Product product5 = new Product(10,"IphoneX",85000,"mobile");
		
		if(product1.equals(product5)) {
			System.out.println("Both products are equal");
		}
		else {
			System.out.println("Both products not are equal");
		}
	}
}
