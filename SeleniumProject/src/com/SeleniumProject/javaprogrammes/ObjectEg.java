package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) {
		Object[] x={"Selenium",700000, false, 3333.33,'M'};
		
		System.out.println(x.length);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
