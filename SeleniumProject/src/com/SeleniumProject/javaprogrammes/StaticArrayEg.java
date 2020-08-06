package com.SeleniumProject.javaprogrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		int[] Salary={10000,20000,30000,40000,50000,60000,70000};
		
		System.out.println(Salary.length);

//		System.out.println(Salary[4]);
		
//		for (int i = 0; i < Salary.length; i++) {
//			System.out.println(Salary[i]);
//		}
		
		for(int data : Salary){
			System.out.println(data);
		}
	}

}
