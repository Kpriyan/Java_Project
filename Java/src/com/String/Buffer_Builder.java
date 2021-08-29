package com.String;

public class Buffer_Builder {

	public static void main(String[] args) {
         // String
		System.out.println("string is immutable");
		String name = "vinoth";
		System.out.println(name.concat("priyan"));
		System.out.println("original name :" + name);
		
		// String Buffer
		System.out.println("string Buffer is mutable");
		StringBuffer buffer = new StringBuffer("vinoth");
		System.out.println(buffer.append("priyan"));
		System.out.println("Original name:" + buffer);
		
		//Reverse
		System.out.println(buffer.reverse());
		//Replace
		StringBuffer buffer1 = new StringBuffer("vinoth");
		System.out.println(buffer1.replace(0, 3, "priyan"));
		// Delete
		StringBuffer buffer2 = new StringBuffer("priyan");
		System.out.println(buffer2.delete(0, 3));
		// Insert & capacity check
		StringBuffer buffer3 = new StringBuffer("vinoth");
		System.out.println(buffer3.insert(6, "priyan"));
		System.out.println(buffer3.capacity());
		
		//String Builder
		StringBuilder builder = new StringBuilder("vinoth");
		System.out.println(builder.append("priyan"));
		System.out.println("Original name:" + builder);
		
		// Reverse
		System.out.println(builder.reverse());
		// Replace
		StringBuilder bulider1 = new StringBuilder("priyan");
		System.out.println(bulider1.replace(0, 3, "vino"));
		// Delete
		StringBuilder bulider2 = new StringBuilder("priyan");
		System.out.println(bulider2.delete(1, 4));
		// Insert & capacity check
		StringBuffer bulider3 = new StringBuffer("priyan");
		System.out.println(bulider3.insert(6, "vinoth"));
		System.out.println(bulider3.capacity());
				
		
		
		
		
		
		
	}

}
