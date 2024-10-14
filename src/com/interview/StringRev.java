package com.interview;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Capgemini";
		String s = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			s = s+str.charAt(i);
		}
		System.out.println("Reverse string :"+s);
	}

}
