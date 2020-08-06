package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> x=new ArrayList<Object>();
		
		x.add("Selenium");
		x.add(70000);
		x.add('M');
		x.add(true);
		x.add("Selenium");
		x.add(5, 4444.44);
		x.remove(2);
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}

	}

}
