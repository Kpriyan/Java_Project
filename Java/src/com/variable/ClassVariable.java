package com.variable;

public class ClassVariable {
      int a = 50;
      int b = 100;    // data given in class use inside the class
      int c = a+b;
      
      public void addition() {
    	  System.out.println(a);
      }
      
       public void multiply() {
    	  System.out.println(b);
      }
      
      public void total() {
    	  System.out.println(c);
      }
      
       public static void main(String[] args) {
		
		ClassVariable obj = new ClassVariable();
		
		  obj.addition();
		  obj.multiply();
		  obj.total();
		 
		      //(OR)
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		
		
		

	}

}
