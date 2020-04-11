package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaSreamExample {
public static void main(String[] args) {
	List<Product> productsList=new ArrayList<Product>();
	
	//Adding products
	productsList.add(new Product(1,"Hp",22211));
	productsList.add(new Product(2,"Dell",15243));
	productsList.add(new Product(3,"Lenevo",23233));
	productsList.add(new Product(4,"Sony",23233));
	productsList.add(new Product(5,"Apple",923233));
  List<Float> productPriceList=new ArrayList<Float>
  ();
  for(Product product:productsList) {
	  //filtering data of list
	  if(product.price<30000) {
		  productPriceList.add(product.price);//adding price to a productPrice
	  }
  }
  System.out.println(productPriceList);//displaying data
}
}
