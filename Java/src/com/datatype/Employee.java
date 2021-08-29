package com.datatype;


public class Employee {
	
	
	
	int      Id          =  1001;
	String   Name        =  "vinoth";
	String   Datebrith   =  "15/01/1995";
	Long     PhoneNumber =  1234567891l;
	String   EmailId     =  "vj123@gmail.com";
	String   Address     =  "48,marry helan street , vettri nagar , chennai";
	int      salary      =   30000;   
	
	public void Employeedetails () {
		System.out.println("Employee details");
		
		System.out.println("EmployeeId:"+"1001");
		System.out.println("Name:"+ "vinoth");
		System.out.println("Datebrith:"+"datebrith");
		System.out.println("phoneNumber:"+"1234567891");
		System.out.println("EmailId:"+"vj123@gmail.com");
		System.out.println("Address:"+"48,marry helan street , vettri nagar , chennai");
		System.out.println("salary:"+" 30000");
		//System.out.println("EmployeeId"+"1001"+"Name"+"vinoth");
		
		
		}

	public static void main(String[] args) {
		
		Employee detail = new Employee();
		
		detail.Employeedetails();
		
		

	

}
	
}
