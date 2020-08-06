package com.SeleniumProject.javaprogrammes;

public class InterfaceReuseEg {

	public static void main(String[] args) {
//		Interfacelmplements2 im2=new Interfacelmplements2();
		InterfaceEg im2=new Interfacelmplements2();
		im2.vehicle();
		
//		InterfaceImplements1 im1=new InterfaceImplements1();
		InterfaceEg im1=new InterfaceImplements1();
		im1.ship();
		
		
	}

}
