package com.interview;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine().toLowerCase();
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
