package com.SeleniumProject.javaprogrammes;

public class ReuseMethodsEg {

	public static void main(String[] args) {
		MethodsEg me=new MethodsEg();
		
		int res=me.sum(600 , 400);
		System.out.println(res);

		res=me.sum(20, 30, 40);
		System.out.println(res);
	}

}
