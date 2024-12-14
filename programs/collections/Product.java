package collectionapp;

import java.util.Objects;

public class Product implements Comparable<Product> {

	private int productId;
	private String productName;
	private float productPrice;
	private String category;

	public Product() {

	}

	public Product(int productId, String productName, float productPrice, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, productId, productName, productPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && productId == other.productId
				&& Objects.equals(productName, other.productName)
				&& Float.floatToIntBits(productPrice) == Float.floatToIntBits(other.productPrice);
	}

	@Override
	public int compareTo(Product o) {
		// sorting based on product names
		// int result = this.productName.compareTo(o.getProductName());

		// sorting based on product ids
		// int result = this.productId - o.getProductId();

		// sorting based on product price in asc
		//int result = (int) (this.productPrice - o.getProductPrice()); 	
		
		// sorting based on product price in des
		int result = (int) (o.getProductPrice() - this.productPrice);
		return result;
	}
}
