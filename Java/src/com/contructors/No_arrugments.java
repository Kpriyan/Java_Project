package com.contructors;

public class No_arrugments {
	  String Java1;
	  String Java2;
	  String Java3;
	
	No_arrugments(){
		
		Java1="JRE";
		Java2="JVM";
		Java3="JDK";
		
		System.out.println("Become a tester you must learn java ");
		
	}
	
	public void java() {
	  System.out.println("Java architecture");
	}

	public static void main(String[] args) {
		No_arrugments obj = new No_arrugments();
		obj.java(); 
		
		System.out.println(obj.Java1);
		System.out.println(obj.Java2);
		System.out.println(obj.Java3);
		
		

	}

}
