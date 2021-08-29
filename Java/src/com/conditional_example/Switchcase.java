package com.conditional_example;

public class Switchcase {
	
	String name = "vinothpriyan";
	
   public void employeename() {
	   
	   switch (name) {
	case "priyan":
		
		System.out.println("Enter the name priyan");
		
		break;

	
	}
	   
	   
	   switch (name) {
		case "vinoth":
			System.out.println("Enter the name vinoth");
			
			break;

		
		}
	   
	   
	   switch (name) {
		case "vino":
			System.out.println("Enter the name vino");
			
			break;

		default:
			System.out.println("I dont know");
		}
	   
   }
	
	
	
	
	

	public static void main(String[] args) {
		
		Switchcase obj = new Switchcase();
		obj.employeename();
		
		

	}

}
