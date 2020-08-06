package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] sample=new Object[5];

		System.out.println(sample.length);
		
//		System.out.println(sample[2]);
		
		sample[0]=true;
		sample[2]="Selenium";
		sample[0]=70000;
		
		for (int i = 0; i < sample.length; i++) {
			System.out.println(sample[i]);
		}
	}

}
