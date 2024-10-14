package com.task;

public class NoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		String sentence = "Hello world";
		String[] words = sentence.split(" ");
		for(String s:words) {
			n++;
		}
		System.out.println(n);
		
		//String[] words = sentence.split("\\s");
		//System.out.println(words.length);
	}

}
