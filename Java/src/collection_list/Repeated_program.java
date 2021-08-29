package collection_list;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_program {

	public static void main(String[] args) {
     
		String s = "what you think what you become";
		
		//split the each word by using split method
		
		String[] sp = s.split(" ");
		
		//create a empty map
		
				Map<String, Integer> map = new HashMap<String,Integer>();
				
		
		//for each method
		
		    for (String str : sp) {
			
			//System.out.println(string);
		
			// if else condition
		    	
			if (map.containsKey(str)) {
				
			Integer i =	map.get(str);
			
			map.put(str, i+1);
				
			}else {
				map.put(str, 1);
			}
			
		}
		    
		System.out.println(map);
		
		// Set entry until
		
		Set<Entry<String, Integer>> entryset =map.entrySet();
		
		System.out.println(entryset);
		
		//iterate
		
		// for each & if else condition
		
		for (Entry<String, Integer> entry : entryset) {
			
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}else {
				
				System.out.println(entry);
				
			}
			
		}
		
	}

}
