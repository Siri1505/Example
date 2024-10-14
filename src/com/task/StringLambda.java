package com.task;

import java.util.Scanner;

interface Check{
	boolean stringChecker(String str);
}

public class StringLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Check c = (str)-> str.isEmpty();
		
		System.out.println(c.stringChecker(s));
	}

}
