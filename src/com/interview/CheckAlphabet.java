package com.interview;

public class CheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Siri";
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
				System.out.println("Contains only alphabets.....");
			}
		}
	}

}
