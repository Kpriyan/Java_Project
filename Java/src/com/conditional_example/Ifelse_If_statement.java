package com.conditional_example;

public class Ifelse_If_statement {
	
	String disease = "covid19";
	
	
	public void virus() {
		if (disease.equals("covid_20")) {
			System.out.println("This covid20 virus world effected virus" );
			
		}
		else if (disease.equals("covid_21")) {
			System.out.println("This covid21 virus world effected virus");
			
		} 
		
		else if (disease.equals("covid_19")) {
			System.out.println("This covid19 virus only world effected virus");
			
			
		}
		
		
		else {
			
			System.out.println("I don't know world virus");

		}
	}
	
	public static void main(String[] args) {
		
		Ifelse_If_statement obj = new Ifelse_If_statement();
		obj.virus();
		
		
		
	}

}
