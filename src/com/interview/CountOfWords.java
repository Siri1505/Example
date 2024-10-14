package com.interview;

public class CountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		String str = "Hello welcome to java";
		String[] words = str.split(" ");
		for(String s:words) {
		n++;
	}
		System.out.println(n);
	}	

}
