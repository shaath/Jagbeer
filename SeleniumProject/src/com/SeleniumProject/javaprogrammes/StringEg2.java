package com.SeleniumProject.javaprogrammes;

public class StringEg2 {

	public static void main(String[] args) {
		String course="Selenium";
		
//		System.out.println(course.length());
//		System.out.println(course.toUpperCase());
//		System.out.println(course.toLowerCase());
		
//		String x=course.trim();
//		System.out.println(x.length());
		
//		if (course.equalsIgnoreCase("selenium")) {
//			System.out.println("Both the strings are same");
//		}else{
//			System.out.println("Both are not same");
//		}
		
//		if (course.contains("Len")) {
//			System.out.println("Pass");
//		}else{
//			System.out.println("Fail");
//		}
		
		if (course.endsWith("ium")) {
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		
	
			
	}

}
