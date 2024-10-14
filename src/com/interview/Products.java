package com.interview;

public class Products implements Comparable<Products>{
	
	    private int productId;
	    private String productName;

	    public Products(int productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    @Override
	    public int compareTo(Products other) {
	        return this.productName.compareTo(other.productName);
	    }

	    @Override
	    public String toString() {
	        return "Product{" +
	                "productId=" + productId +
	                ", productName='" + productName + '\'' +
	                '}';
	    }
	

}
