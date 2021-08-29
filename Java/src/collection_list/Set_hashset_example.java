package collection_list;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;

public class Set_hashset_example {
	
	public void hashset() {
		
		//Set<Integer> hash = new HashSet<Integer>();
		
		HashSet<Integer> hash  = new HashSet<Integer>(); // all generic same <> possible differ not possible
		
		hash.add(10);
		hash.add(20);
		hash.add(30);
		
		System.out.println(hash);
		
		HashSet<Integer> hash1  = new HashSet<Integer>();
		
		hash1.add(40);
		hash1.add(30);
		hash1.add(20);
		
		// add all
		
		hash1.addAll(hash);
		System.out.println("add all:"+hash1);
		
	    // clear
		//hash.clear();
		//System.out.println(hash);
		
		// contains
	   boolean bol = hash.contains(10);
	   System.out.println("contains:"+bol);
	   
	   // contains all
	   
	 boolean boll =  hash.containsAll(hash1);
	   System.out.println("contains all:"+boll);
	   
System.out.println("...........................Iterator methods....................................."); 

	 Iterator<Integer> inter = hash.iterator();
	 while (inter.hasNext()) {
		 System.out.println("Interatornext:"+inter.next());
		
	}
	 
 System.out.println(".............................................................");
 
	 for (Integer integer : hash1) {
		 System.out.println("For each:"+integer);
		
	}
	 
	 
 }
	
	public static void main(String[] args) {
		Set_hashset_example obj = new Set_hashset_example();
		obj.hashset();
		

	}

}
