package com.interview;

import java.util.Arrays;

public class ArrayAsce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"Capgemini","Accenture","TCS","EPAM"};
		Arrays.sort(s);
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		
	}

}
