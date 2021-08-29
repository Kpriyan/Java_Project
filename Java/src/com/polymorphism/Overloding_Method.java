package com.polymorphism;

public class Overloding_Method {
	
	public int ammount(int n1, int n2) {
		System.out.println(n1 + n2);
		return(n1 + n2);
		
	}
	
     public int ammount(int n1, int n2, int n3) {
		System.out.println(n1 * n2 * n3);
		return(n1 * n2 * n3);
		
	}
     
	public int ammount(int n1, int n2, int n3, String total) {
		System.out.println(n1 + n2 + n3 +"Rs");
		return(n1 + n2 +n3);
		
	}

	public static void main(String[] args) {
		Overloding_Method obj = new Overloding_Method();
		 obj.ammount(25, 25);
		 obj.ammount(10, 10, 10);
		 obj.ammount(100, 100, 100, "Rs");
	}

}
