package com.ty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Product {

	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		List<Product> p1 = new ArrayList<>();
		Product product1 = new Product(1, "Apple", 20.00);
		Product product2 = new Product(2, "Orange", 10.00);
		Product product3 = new Product(3, "Mango", 30.00);

		p1.add(product1);
		p1.add(product2);
		p1.add(product3);

		double d = p1.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println(d);

	}
}
