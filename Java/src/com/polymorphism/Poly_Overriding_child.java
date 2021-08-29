package com.polymorphism;

public class Poly_Overriding_child extends poly_overriding_parent  {
	
	@Override
	public void studentdetail() {
		System.out.println("StudentcellNumber:"+123456789);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		poly_overriding_parent obj = new Poly_Overriding_child();
		//Poly_Overriding_child obj = new Poly_Overriding_child();
		//poly_overriding_parent obj = new poly_overriding_parent();
		obj.studentdetail();
		obj.studentdetails();

	}

}
