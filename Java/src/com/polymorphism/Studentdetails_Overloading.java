package com.polymorphism;

public class Studentdetails_Overloading {
	
	public void Studentdetail() {
		System.out.println("Studentdetail");
		
	}
	
   public void Studentdetail(int a) {          // data type
	   System.out.println("Student ID:" + a);
		
	}
   
   public void Studentdetail(int a,String b) {   // data type order
	   System.out.println(b+" "+a);
		
	}
   
   public void Studentdetail(int a,int b) {      // data type count
	   System.out.println(a+b);
		
	}


	public static void main(String[] args) {
		
		Studentdetails_Overloading Source = new Studentdetails_Overloading();
		
		Source.Studentdetail();
		Source.Studentdetail(101);
		Source.Studentdetail(30, 20);
		Source.Studentdetail(70, "studentmark :");
		

	}

}
