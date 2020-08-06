package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args) {
			//initialization; condition ; incrementor
		/*for(int i = 1; i <= 10 ; i++ ){
			System.out.println("Hi");
		}*/
									//i=i+1
		for(int i = 1 ; i <= 100 ; i++){
			System.out.println(i);
			if(i == 50){
				break;
			}
		}
		
		System.out.println("Decrementor Loop");							//i=i-1
		for(int i = 500; i > 0; i--){
			System.out.println(i);
			
		}
		
		
	}

}
