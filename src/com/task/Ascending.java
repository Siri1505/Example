package com.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(2,4,0,1,56,23,4);
		
		Collections.sort(list);
		System.out.println(list);
		
		//List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		//System.out.println(sort);
		
	}

}
