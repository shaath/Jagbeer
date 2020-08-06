package com.SeleniumProject.javaprogrammes;

public class InheritanceEg extends MethodsEg {

	public static void main(String[] args) {
		Function1();
		
		MethodsEg me = new MethodsEg();
		int ress=me.sum(20, 30);
		System.out.println(ress);

		
	}
	
	public static void Function1(){
		System.out.println("This is inheritance Function1 code");
	}
}
