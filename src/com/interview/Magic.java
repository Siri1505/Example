package com.interview;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		while(n>9) {
			int sum=0;
			
			while(n!=0) {
			rem = n%10;
			sum=sum+rem;
			n = n/10;
			}
			n = sum;
			System.out.println(sum);
		}
		
		if(n==1) {
			System.out.println("Magic number......");
		}
		else {
			System.out.println("Not a magic number....");
		}
		
		
	}

}
