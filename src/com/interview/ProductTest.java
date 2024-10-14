package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> list = new ArrayList<>();
		list.add(new Products(125, "Soap"));
		list.add(new Products(101, "Lux"));
		list.add(new Products(110, "Yardley"));
		list.add(new Products(120, "Sandal"));
		
		Collections.sort(list);
		
		for(Products p:list) {
			System.out.println(p);
		}
		
	}

}
