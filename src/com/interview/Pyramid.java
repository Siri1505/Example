package com.interview;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,size=6;
		
		for ( i = 1; i <= size; i++) {
            // Inner loop for spaces
            for ( j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            
            for ( k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
	}

}
