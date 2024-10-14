package com.task;


interface Addable{
	int add(int a,int b);
}

public class AddLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable d2 = (a,b)-> (a+b);
		System.out.println(d2.add(20,56));
	}

}
