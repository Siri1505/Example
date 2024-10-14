package com.task;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,0,1,56,23,4};
        int temp=0;
        for(int i=0;i<a.length-1;i++) {
            for(int j=0;j<a.length-i-1;j++) {
                if(a[j] > a[j+1]){  
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;

        }
            }
        }
        System.out.println(a[a.length-2]);
		/*
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
	}

}
