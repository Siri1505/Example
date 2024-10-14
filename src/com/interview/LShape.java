package com.interview;



public class LShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,size=6;

        for ( i = 1; i <= size; i++) {
            
            for ( j = 1; j <= size; j++) {
                if (j == 1 || i == size)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

 
	}

}
