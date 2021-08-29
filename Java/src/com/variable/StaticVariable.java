package com.variable;

public class StaticVariable {
	  
	static int a = 30;
	static int b = 100;
	
	public static void addition() {
		int a =30;               
		System.out.println(a);
	}
	 public static void multi() {
		 int b = 100;
		 System.out.println(b);
	 }
	 
	 public static void total() {
		 System.out.println(a+b);
	 }

	public static void main(String[] args) {
		
		addition();
		multi();
		total();
	
		
	}

}
