package com.interview;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,7,8,9,10};
		int[] a1 = {2,4,6,10,12,14,16,18,20};
		int[] a2 = {1,3,5,9,11,13,15,17};
		
		int len = a.length;
		int m = len+1;
		int sum = m*(m+1)/2;
		for(int i=0;i<len;i++ ) {
			sum = sum-a[i];
		}
		System.out.println("Missing number: "+sum);
		
		int len1 = a1.length;
		int n = len1;
		int sum1 =(n+1)*(n+2);
		for(int i=0;i<a1.length;i++ ) {
			sum1 = sum1-a1[i];
		}
		System.out.println("Even number missing:"+sum1);
		
		int len2 = a2.length;
		int n1 = len2;
		int sum2 =(n1+1)*2;
		for(int i=0;i<len2;i++ ) {
			sum2 = sum2-a2[i];
		}
		System.out.println("Odd number missing:"+sum2);
		
	}

}
