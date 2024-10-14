package com.task;

public class TestEx {
	public static void main(String[] args) {
		String str = "SUhbfn&%nb";
		String repstring = str.replaceAll("[a-z]", "");
		System.out.println(repstring);
	}
}
