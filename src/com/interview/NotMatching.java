package com.interview;

public class NotMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		
		String nonMatchingChars = " ";
		
		for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            boolean foundMatch = false;
            
            for (int j = 0; j < str2.length(); j++) {
                char ch2 = str2.charAt(j);

                if (ch1 == ch2) {
                    foundMatch = true;
                    break; 
                }
            }

            if (!foundMatch) {
                nonMatchingChars += ch1;
            }
        }

		System.out.println("Non matching string : "+nonMatchingChars);
	}

}
