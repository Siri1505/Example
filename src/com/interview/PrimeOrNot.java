package com.interview;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int flag = 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime number....");
		}
		else {
			System.out.println("Not a prime number.....");
		}
	}

}
