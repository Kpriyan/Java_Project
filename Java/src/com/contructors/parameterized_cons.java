package com.contructors;



public class parameterized_cons {
	String animal;
	
	
	parameterized_cons(String name){
		
		animal=name;
		
		
		
	}
	
	public void sayAboutAnimal() {
		System.out.println("anminal name is " + animal);
		
	}

	public static void main(String[] args) {
		parameterized_cons obj = new parameterized_cons("Lion");
		obj.sayAboutAnimal();
		
		
		

	}

}
