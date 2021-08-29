package com.variable;

public class LocalVariable {
	
	public void addition() {        
		int a =30;               // Local variable use only  inside method
		System.out.println(a);
	}
	
	
      public static void main(String[] args) {
		
		LocalVariable obj = new LocalVariable();
		
		obj.addition();
		
		
	}

}
