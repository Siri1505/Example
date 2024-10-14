package com.task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String regex = "[a-z]";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(str);
		
		System.out.println("After removing :" +matcher.replaceAll(""));
		
	}

}
