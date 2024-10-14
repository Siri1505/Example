package com.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Hello","Welcome","Fruits");
		
		System.out.println("Uppercase: ");
		list.forEach(n->System.out.println(n.toUpperCase()));
		
		System.out.println("Lowercase: ");
		list.forEach(n->System.out.println(n.toLowerCase()));
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * List<String> upper = list.stream().map(str ->
		 * str.toUpperCase()).collect(Collectors.toList());
		 * System.out.println("Upper case : "+upper);
		 * 
		 * List<String> lower = list.stream().map(str ->
		 * str.toLowerCase()).collect(Collectors.toList());
		 * System.out.println("Lower case : "+lower);
		 */
	}

}
