package collection_list;

import java.util.Iterator;
//import java.util.Set;
import java.util.TreeSet;

public class T_set {

	public static void main(String[] args) {
		
		//Set<Integer> list = new TreeSet<Integer>();
     
		TreeSet<Integer> list = new TreeSet<Integer>();
		
		list.add(10);
		list.add(2);
		list.add(0);
		list.add(70);
		list.add(900);
		list.add(3);
		System.out.println(list);
		
		TreeSet<String> lis = new TreeSet<String>();
		
		
		  lis.add("guindy");
		   lis.add("kolathur");
		   lis.add("adyar");
		   lis.add("maduravoyal");
		   lis.add("vadapalani");
		   
		   System.out.println(lis);
		   
		
		// add 
		System.out.println("add:"+list);
		
		// First [print first value in the tree list]
		System.out.println("Firstelement:"+list.first());
		
		// last [print last value in the tree list]
		System.out.println("Lastelement:"+list.last());
		
		// head set [below 70 in list tree]
		System.out.println("Headset:"+list.headSet(70));
		
		// tail set [given value 100  + 100 above value print]
		System.out.println("Tailset:"+list.tailSet(100));
		
		// sub set[ given starting value + intermediate of end value print]
		System.out.println("Subset:"+list.subSet(10, 900));
		
		//Comparator [tree list print in Ascending order means 
		//comparator print null/ in_case any_other order print means comparator print that order name]
		System.out.println("comparator:"+list.comparator());
		
		//HIgher [ given value next step higher value only print]
		System.out.println("Higher:"+list.higher(10));
		
		// lower[given value previous step lower value only print]
		System.out.println("lower:"+list.lower(100));
		
		//poll first [ poll first print only first value of tree list and delete that value ]
		System.out.println("pollfirst:"+list.pollFirst());
		
		// poll last [ poll last print only last value of tree list and delete that value]
		System.out.println("polllast:"+list.pollLast());
		
		// after poll [ poll delete the last and first poll value in tree list]
		System.out.println("After poll:"+list);
		
		//Descending order
		System.out.println(list.descendingSet());
		
System.out.println("...........................Iterator methods.....................................");

  for (Integer integer : list) {
	  System.out.println("For each:"+integer);
	
}
System.out.println(".............................................................");
       Iterator<Integer> inter = list.iterator();
		while (inter.hasNext()) {
			System.out.println("Iterator next:"+inter.next());
			
		}
		
System.out.println(".............................................................");
		
		Iterator<Integer> inters = list.descendingIterator();
		while (inters.hasNext()) {
			System.out.println("DescendingIterator:"+inters.next());
		}
		
		
	}

}
