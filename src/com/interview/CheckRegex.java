package com.interview;

public class CheckRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Siri123";
		boolean s = str.matches("[a-zA-Z]+");
		
		if(s) {
			System.out.println("Contains only alphabets......");
		}
		else {
			System.out.println("Contains alphabets and digits");
		}
	}

}
