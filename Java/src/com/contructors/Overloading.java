package com.contructors;

public class Overloading {
	String EmployeeName;
	
	Overloading(){
		
		System.out.println();
	}
	
	Overloading(String employee) {
		
	EmployeeName=employee;
		
		System.out.println("Empoyee name:" + employee);
	}

	public static void main(String[] args) {
		Overloading  obj = new Overloading();
		Overloading  obj1 = new Overloading("vino");

	}

}
