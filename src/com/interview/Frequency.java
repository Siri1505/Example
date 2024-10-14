package com.interview;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Capgemini Training";
		
		String s = str.toLowerCase();
		String st= "";
		for(int i=s.length()-1;i>=0;i--) {
			st = st+s.charAt(i);
		}
		System.out.println(st);
		
		int[] count = new int[5];
		for(int i=0;i<st.length();i++) {
			char c = st.charAt(i);
			
			if(c=='a') {
				count[0]++;
			}
			else if(c=='e') {
				count[1]++;
			}
			else if(c=='i') {
				count[2]++;
			}
			else if(c=='o') {
				count[3]++;
			}
			else if(c=='u') {
				count[4]++;
			}
		}
		System.out.println("Frequency of a: "+count[0]);
		System.out.println("Frequency of e: "+count[1]);
		System.out.println("Frequency of i: "+count[2]);
		System.out.println("Frequency of o: "+count[3]);
		System.out.println("Frequency of u: "+count[4]);
	}

}
