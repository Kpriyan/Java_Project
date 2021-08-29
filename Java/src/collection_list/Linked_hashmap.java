package collection_list;

import java.util.LinkedHashMap;

public class Linked_hashmap {
	
	// map[interface].....(child) Linked hash map
	
    // Linked Hash map use key, value generic method	
			
	//  linked_hashmap  methods  same as hash_map methods
			
   // only one change linked_hashmap print insertion order / hash map print random order or key order
			
  // duplicate key not allow & duplicate value allow
			
 // one null value and one key allow
	
	public void maptype() {
		
		LinkedHashMap<Integer, Integer>  linkmap = new LinkedHashMap<Integer, Integer>();
		
		linkmap.put(1, 55);
		linkmap.put(2, 45);
		linkmap.put(4, 35);
		linkmap.put(3, 25);
		linkmap.put(5, 15);
		
		System.out.println("add:"+linkmap);
		
		
		
		}
	
	public static void main(String[] args) {
		
		Linked_hashmap obj = new Linked_hashmap();
		
		obj.maptype();

	}

}
