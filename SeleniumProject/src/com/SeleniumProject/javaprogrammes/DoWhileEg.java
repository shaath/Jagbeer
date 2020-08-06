package com.SeleniumProject.javaprogrammes;

public class DoWhileEg {

	public static void main(String[] args) {
		int i = 1;
	/*	do{
			System.out.println(i);
			i++;
		}while(i <= 100);*/
		
		int j=100;
		do{
			System.out.println(j);
			if (j == 25) {
				break;
			}
			j--;
		}while(j >= 1);
	}

}
