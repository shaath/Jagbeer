package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) {
		HashSet<Object> y=new HashSet<Object>();
		
		y.add("Selenium");
		y.add("Boll");
		y.add(70000);
		y.add(true);
		y.add("Selenium");
		
		Iterator<Object> it=y.iterator();
		
		while(it.hasNext()){
			Object data=it.next();
			System.out.println(data);
		}
		
		

	}

}
