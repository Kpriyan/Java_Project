package collection_list;

import java.util.Collection;
import java.util.HashMap;


public class Hash_map_example {

	public static void main(String[] args) {
		
		// map[interface].....(child) hash map
		// Hash map use key, value generic method
		// one null value and one null key allow more than one null key use means values point out
	    // duplicate key not allow 
	   // duplicate value allow
	   // print only key order or random order
				
				
     HashMap<Integer, String> names = new HashMap<Integer, String>();
     
		// put /add 
		names.put(1, "vinoth");           
		names.put(2, "riya");                     
		names.put(2, "riya");                    
		names.put(4, "avinesh");                  
		names.put(5, "swetha");                 
		names.put(4, "priyan");                
		names.put(3, "swetha");               
		names.put(null, null);                
		names .put(null,"vp");
		names.put(6, null);
		
		//1. put / add
		System.out.println("add:"+names);
		
		//2. put all / add all
		
		HashMap<Integer, String> tempnames = new HashMap<Integer, String>();
		
		names.putAll(tempnames);
		System.out.println("put all:"+names);
		
		//3. clone [ use to another copy of map list]
		
		System.out.println("clone:"+names.clone());
		
		//4. clear[Delete the map list]
		
		 tempnames.clear();
		 System.out.println("clear:"+tempnames);
		 
		 //5. key set[print key values] 
		 
		 System.out.println("key set:"+names.keySet());
		 
		 //6. get [index true or false]
		 
		 System.out.println(names.get(2));
		
		//7. values[print values ]
		 
		 System.out.println(names.values());
		 Collection<String> value = names.values();
		 System.out.println("values:"+value);
		 
		 //8. contains key[To check if a key is present or not in the map]
		 
		 System.out.println(names.containsKey(5));
		 
		 //9. contains values[To check if a value is present or not in the map]
		 
		  System.out.println(names.containsValue("swetha"));
		 
		 //10. entry set[print total map list]
		 
		 System.out.println("Entry set:"+names.entrySet());
		 
		 //11. empty [ check if the map list is empty or not]
		 
		 System.out.println(names.isEmpty());
		
		
		
		
		
		
		
		
		
		
	}

}
