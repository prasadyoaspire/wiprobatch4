class ProductArrayDemo {

  public static void main(String[] args) {

     Product p1 = new Product(10,"Iphonex",85000,"Mobile");
     Product p2 = new Product(20,"DellXP",120000,"Laptop");
     Product p3 = new Product(30,"SonyZ+",15000,"Headphone");
     Product p4 = new Product(40,"SamsungF50",45000,"Mobile");

     Product[] myProducts = new Product[3];

     myProducts[0] = p1;
     myProducts[1] = p2;
     myProducts[2] = p3;

    for(int i=0;i<myProducts.length;i++) {

       //System.out.println(myProducts[i]);

       //System.out.println(myProducts[i].productId+" "+myProducts[i].productName+" "+myProducts[i].productPrice+" "+myProducts[i].category);

       myProducts[i].displayProductDetails();
    }

  }
}