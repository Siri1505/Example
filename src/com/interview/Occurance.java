package com.interview;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("Occurence of "+ c +" count is "+count);
	}

}
