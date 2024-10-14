package com.interview;

public class MatchingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sirha";
		String s2 = "Shiree";
		
		String matchStr = " ";
		
		for(int i=0;i<s1.length();i++) {
			char ch1 = s1.charAt(i);
			
			for(int j=0;j<s2.length();j++) {
				char ch2 = s2.charAt(j);
				
				if(ch1==ch2) {
					matchStr = matchStr+ch1;
					break;
				}
			}
		}
		System.out.println("matching String : "+matchStr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(char ch1:s1.toCharArray()) { for(char ch2:s2.toCharArray()) {
		 * if(ch1==ch2) { sb.append(ch1); }
		 * 
		 * } }
		 */
		//System.out.println("Matching characters:"+ sb);
	}

}
