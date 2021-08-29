package com.polymorphism;

public class TalkingMethod {
	
	public void talk(parent styleofTalking) {
		System.out.println("Respectfull");
		
	}
	
   public void talk(partner styleofTalking) {
	   System.out.println("Romatic");
		
	}

   
   public void talk(boss styleofTalking) {
	   System.out.println("nothing personal");
		
	}
	

	public static void main(String[] args) {
		
		TalkingMethod talking = new TalkingMethod();
		parent parents= new parent();
		talking.talk(parents);
		partner partners = new partner();
	    talking.talk(partners);
	    boss biggboss = new boss();
	    talking.talk(biggboss);

	}

}
