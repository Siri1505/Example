package com.interview;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int  r,rev = 0;
		int temp=num;
		
		while(num>0) {
			r = num%10;
			rev =rev*10+r;
			num=num/10;
		}
		
		if(temp==rev) {
			System.out.println("Palindrome.........");
		}
		else {
			System.out.println("Not a palindrome...........");
		}
	}

}
