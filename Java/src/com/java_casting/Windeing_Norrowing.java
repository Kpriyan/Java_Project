package com.java_casting;

public class Windeing_Norrowing {
	
	
	public static void main(String[] args) {
		
		// low to high Winding
		
		byte b = 10; // 8bit/1byte
		
		int i = b;   // 32bit/4byte
		
		System.out.println(i);
		
		
		// high to low Norrowing
		
		double d = 500.65; // 64bit/8byte
		
		//short s = d;      // 16bit/2byte
		 short s = (short)d;
		 
		 System.out.println(s);
		 
		 // equal
		 
		 //double d = 500.65; // 64bit/8byte
		 
		 //long   l  = d;
		
		

		
		
		
		
		

	}

}
