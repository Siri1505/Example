package com.interview;

interface Test{
	void method();
	default void bike() {
		System.out.println("bike started.......");
	}
}
public class Default implements Test{

	@Override
	public void method() {
		System.out.println("this is abstract method....");
	}
	
	public void bike() {
		System.out.println("Bike stopped.....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default obj = new Default();
		obj.bike();
		obj.method();
	}



}
