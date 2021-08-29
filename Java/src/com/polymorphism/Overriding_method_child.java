package com.polymorphism;
// child class
public class Overriding_method_child extends Overriding_method_parent {
	
	
	/*@Override
	public void EmployeeID(String ID) {
		super.EmployeeID(ID);
	}*/
	  
	@Override
	public void EmployeeID (String ID) {
		System.out.println("EmployeeID:"+ID);
	}
	
	

	public static void main(String[] args) {

		Overriding_method_parent obj = new Overriding_method_child();  //parent class = new child class();
		
		//Overriding_method_child obj = new Overriding_method_child(); // child class = new child class();
		obj.Employeedetails("Employee details");
		obj.EmployeeID("12412871");
		obj.EmployeeName("vinothpriyan");
	
		
	}

}
