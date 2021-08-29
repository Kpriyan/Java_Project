package collection_list;

import java.util.Iterator;
import java.util.LinkedList;
//import java.util.List;
import java.util.ListIterator;

public class Linked_list {

	public static void main(String[] args) {
		
    // List<String> links = new LinkedList<String>();
			
     
	LinkedList<String> links = new LinkedList<String>();
	
	links.add("bmw");
	links.add("audi");
	links.add("1");
	links.add("1");
	System.out.println(links);
	
	// add first
	links.addFirst("bently");
	System.out.println(links);
	
	// add last
	links.addLast("toyoto");
	System.out.println(links);
	
	//get
	System.out.println(links.get(1));
	System.out.println(links.getFirst());
	
	
	System.out.println(".................................");
	/*// remove first
	links.removeFirst();
	System.out.println(links);
	//remove last
	links.removeLast();
	System.out.println(links);
	
	// poll first
	links.pollFirst();
	System.out.println("pollfirst:"+links);
	// poll last
	links.pollLast();
	System.out.println("polllast:"+links);
	// poll all
	links.poll();
	System.out.println("pollall:"+links);
	
	//occurrence
	links.removeFirstOccurrence("bently");
	System.out.println(links);
	
	links.removeLastOccurrence("1");
	System.out.println(links);*/
	
	// for method
	System.out.println("For loop method");
	for (int i = 0; i < links.size(); i++) {
		System.out.println("for:"+ links.get(i));
		
	}
	System.out.println(".......................................");
	
	System.out.println("For each");
	for (String string : links) {
		System.out.println("foreach:"+ string);
		
	}
	System.out.println("............................................");
	
	Iterator<String> itr = links.iterator();
	while (itr.hasNext()) {
		System.out.println("Iterator:"+ itr.next());
		
	}
		
		
		System.out.println("............................................");
		
		// another method  
		
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("1");
		link.add("2");
		System.out.println(link);
		
		Iterator<String> iterators = link.iterator();
		while (iterators.hasNext()) {
			System.out.println(iterators.next());
			
		}
		
		System.out.println("................................");
		
		ListIterator<String> lis = links.listIterator();
		while (lis.hasNext()) {
			System.out.println("listIteratorNext:"+ lis.next());
			
		}
		
		System.out.println(".......................................");
		 
		 while (lis.hasPrevious()) {
			 
			 System.out.println("Previous:"+ lis.previous());
			 
		 }
		 
		 
			
		}
		
		
	}


