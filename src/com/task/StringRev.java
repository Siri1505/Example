package com.task;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Capgemini";
		String rev = " ";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
