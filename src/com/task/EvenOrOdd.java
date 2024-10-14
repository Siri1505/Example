package com.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,67,45,89,30,24,56,37);
		
		System.out.println("Even numbers: ");
		list.forEach(n->{
			if(n%2==0) {
				System.out.println(n);
			}
		});
		
		System.out.println("Odd numbers: ");
		list.forEach(n->{
			if(n%2!=0) {
				System.out.println(n);
			}
		});
		
		
		
		
		
		
		/*
		 * List<Integer> even = list.stream().filter(num ->
		 * num%2==0).collect(Collectors.toList());
		 * System.out.println("Even numbers: "+even);
		 * 
		 * List<Integer> odd = list.stream().filter(num ->
		 * num%2!=0).collect(Collectors.toList());
		 * System.out.println("Odd numbers: "+odd);
		 */
		
	}

}
