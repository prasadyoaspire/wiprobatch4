class Product {

  private int productId;
  private String productName;
  private double productPrice;
  private String category;

 Product(int productId, String productName, double productPrice, String category) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    this.category = category;    
 }

  void displayProductDetails() {
    System.out.println("Id:"+ productId);
    System.out.println("Name:"+ productName); 
    System.out.println("Price:"+ productPrice);
    System.out.println("Category:"+category);
  }
}

