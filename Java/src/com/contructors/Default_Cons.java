package com.contructors;

//import polymorphism.Studentdetails;

public class Default_Cons {
	// default
	int StudentId;
	String StudentName; 
	
	// value initiate
	//int a = 22;
	//String b = "Address";

	public static void main(String[] args) {
		
		Default_Cons details = new Default_Cons();
		
		System.out.println(details.StudentId);
		System.out.println(details.StudentName); // default
		
		// value initiate
		//System.out.println(details.a);
		//System.out.println(details.b);


	}

}
