package com.example;

public class Checkalphabet {

	public static void main(String[] args) {
		
		
		 char c = 'b';
		 
	        m1( c);

	}
	
	public static void m1(char c) {
		 if ((c >= 65 &&  c<= 90) || (c >= 97 && c <= 122))
		            System.out.println(" Alphabet ");
		 else
	            System.out.println(" Not a alphabet ");
		 
		
	}

}
