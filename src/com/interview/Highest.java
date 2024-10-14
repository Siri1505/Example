package com.interview;

import java.util.Arrays;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10,76,54,89,23};
		
		Arrays.sort(num);
	    for(int i=0;i<num.length;i++) {
	    	System.out.println(num[i]);
	    }
	    
	    System.out.println("Third highest: "+num[num.length-3]);
	    
	    System.out.println("Second largest:"+num[num.length-2]);
		
		
	}

}
