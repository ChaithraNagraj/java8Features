package com.bridgelabz.streamfilter;

import java.util.ArrayList;
import java.util.List;

public class JavaStreanExample {
public static void main(String[] args) {
	List<Product> productList=new ArrayList<Product>();
	//Adding products
	productList.add(new Product(1,"HP",211223f));
	productList.add(new Product(2,"sony",112131f));
	productList.add(new Product(3,"Dell",33441f));
	productList.add(new Product(4,"Apple",1123131f));
  productList.stream()
.filter(p->p.price>23333)//filtering price
.map(pm->pm.price)//feching price
.forEach(System.out::print);//iterating price
	
}
}
