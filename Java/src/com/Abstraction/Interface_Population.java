package com.Abstraction;

public interface Interface_Population extends Interface_1  {
	
	String Population  = "country total population"; //hide public(String),static(given name ex: pop),final("")
	
	 void Mens();    // hide both public & Abstract
	 
	 void womens(); // hide both public & Abstract
	 

}
       // 1. object (main) function not access
       
       // 2. implementation not access

      // 3. one interface class add another one of the interface class means (use extends keyword)