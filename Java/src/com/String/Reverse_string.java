package com.String;

public class Reverse_string {

	public static void main(String[] args) {
      
		String s = "Hello";
		
		String reverse = "";
		
		for (int i = s.length()-1;i>=0; i--) {
			
			
			reverse =reverse+s.charAt(i);
			
			
		}
		System.out.println(reverse);
		
		
		
		String str = "vinoth";
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(str);
		
		System.out.println(buffer.reverse());
		
		// length
		String st = "priyan";
		
		System.out.println(st.length());
		
		
	}

}
