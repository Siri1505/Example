package com.interview;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Even number..");
		}
		else {
			System.out.println("Odd number..");
		}
	}

}
