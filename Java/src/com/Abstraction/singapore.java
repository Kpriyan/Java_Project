package com.Abstraction;
// child class
public class singapore extends india {
	
	// one java class add another one java class means (use extends keyword)
	
	// one java class add one interface class means (use implements keyword) 
	
	// if you add interface class in java class means(you must use unimplemented method or make class as Abstract)
	
	
	@Override
	public void covidvaccine() {
		System.out.println("Singapore also have available covidvaccine");
	}
	
	@Override
	public void covidshield() {
		System.out.println("Singapore also have available covidshield");
	}

	
	

	public static void main(String[] args) {
		india country = new singapore();
		country.covidvaccine();
		country.covidshield();
		

	}

	

}
