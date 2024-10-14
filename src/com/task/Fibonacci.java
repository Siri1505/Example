package com.task;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		int n=30;
		System.out.println(a+"");
		while(b<=n) {
			System.out.println(b);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
