package com.Abstraction;

//child class

public class america extends india  {
	
	@Override
	public void covidvaccine() {
		System.out.println("America available covidvaccine");
	}
	
	@Override
	public void covidshield() {
		System.out.println("America available covidshield");
	}


	public static void main(String[] args) {
		
		india countrytwo = new america();  //parent class name = new child class name (use overriding method)
		countrytwo.covidvaccine();
		countrytwo.covidshield();
		

	}

}
