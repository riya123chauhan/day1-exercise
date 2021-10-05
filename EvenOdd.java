package com.example;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("even no are ");
		even(10,20);
		
		System.out.println("odd no are ");
		odd(10,20);
		

	}
	
	public static void even(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
	public static void odd(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		
	}

}
}
