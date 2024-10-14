package com.interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count;
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int j=2;j<=n;j++)
		{
		count=0;
		for(i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		       System.out.print(j+"  ");     
		}
		
	}

}
