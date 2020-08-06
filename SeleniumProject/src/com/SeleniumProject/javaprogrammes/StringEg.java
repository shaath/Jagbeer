package com.SeleniumProject.javaprogrammes;

public class StringEg {

	public static void main(String[] args) {
		String course = "Seleniuem";
		String newCourse="";
		int cnt=0;
		int len=course.length();
//		System.out.println("The lenght of the string is : "+len);
		
//		System.out.println(course.charAt(5));
//		System.out.println(course.substring(3, 6));
		
//		System.out.println(course.indexOf('e'));
//		System.out.println(course.lastIndexOf('e'));
		
//		System.out.println(course.replace('e', 'x'));
//		System.out.println();
		for (int i = 0; i < len; i++) {
			char letter=course.charAt(i);
			if (letter == 'e' ) {
				cnt++;
			}
			if (letter == 'e' && cnt==3 ) {
				letter='x';
			}
			newCourse=newCourse+letter;
		}
		System.out.println(newCourse);
	}

}
