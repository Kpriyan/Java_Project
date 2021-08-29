package collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//import com.sun.tools.classfile.Opcode.Set;

public class Arrray_list {

	public static void main(String[] args) {
		
    //  List<String> arraylist = new ArrayList<String>();
		
    ArrayList<String> arraylist =  new ArrayList<String>();
		 
      // Add 3
      arraylist.add("BMW1");
      arraylist.add("BENZE");
      arraylist.add("AUDI");
      arraylist.add("BMW2");
      
      
      List<String> arr = new ArrayList<String>();
      arr.add("BMW1");
      arr.add("AUDI");
      arr.add("1");
      arr.add("3");
      
      
      // 1. Add
      System.out.println(arraylist);
      
       // 2.add All one list to another list
      List<String> secondArrayList = new ArrayList<String>();
     
      secondArrayList.addAll(arraylist);
      System.out.println(secondArrayList);
      
      // 3.size
      int size = arraylist.size();
      System.out.println("total list size:"+size);
      
      // 4. get
      
      System.out.println(arraylist.get(0));
               //(or)
      String str = arraylist.get(2);
      System.out.println(str);
      
       //5.Index of method
      System.out.println(arraylist.indexOf("BMW1"));
      
      // 6. Last index
      System.out.println(arraylist.lastIndexOf("BMW2"));
      
      //7. contains
      boolean bool=   arraylist.contains("AUDI");
      System.out.println("boolean:"+bool);
                     //(or)
      System.out.println(arraylist.contains("BMW1"));
      
      // 8.contains all
      arr.containsAll(arraylist);
      
      System.out.println("Contains all:"+arr);
      
      //9.Add Null
       arraylist.add(null);
       System.out.println(arraylist);
     
      /*//10.clear
        secondArrayList.clear();
        System.out.println(secondArrayList);
      
      //11.Remove
      arraylist.remove(0);
      System.out.println(arraylist);
      
      arraylist.remove("BENZE");
      System.out.println(arraylist);
      
      //12. remove all
       
      arraylist.removeAll(arr);
      System.out.println("remove all:"+arraylist);
       
       //13. retain all
       
       arr.retainAll(arraylist);
       System.out.println("Retain All:"+arr);
      
      //14. add all
      
      arraylist.addAll(arr);
      System.out.println("AddAll:"+arraylist);*/
      
      //15. equals
      
      boolean crt =   arraylist.equals(arr);
         System.out.println("Equals:"+crt);
         
          //16. Set
        arraylist.set(0, "Bently");
        System.out.println(arraylist);
      
      
      //17. Empty
      System.out.println(arraylist.isEmpty());
      
      //18. sort
      
      try {
		arraylist.sort(Collections.reverseOrder());
		  System.out.println("sort:"+ arraylist);
	} catch (Exception e) {
		e.printStackTrace();
	}
      
  
 System.out.println("..................................................");
      
      //For Each Method
      for (String string : secondArrayList) {
    	  System.out.println("using for each:"+string);
		
	}
 System.out.println("..................................................");
      
      
      // For method
      for (int i = 0; i < secondArrayList.size(); i++) {
    	  
    	  System.out.println("using for loop:"+secondArrayList.get(i));
		
	}
  System.out.println("...................IteratorMethod...............................");
      
     ListIterator<String> array = secondArrayList.listIterator();
     
     while (array.hasNext()) {
    	 
		System.out.println("Next:"+ array.next());
		
	}
 System.out.println(".........................................................");
      while (array.hasPrevious()) {
    	 
		System.out.println("Previous:"+ array.previous());
		
		}
 System.out.println(".......................................................");
 
    Iterator<String> iterator = secondArrayList.iterator();
    
       while (iterator.hasNext()) {
    	   
    	   System.out.println("Iterator Next:"+ iterator.next());
    	   
    	   
    	   
    
     }
	
     
     
    
     
	
      
      
      
      
      
      
		
		
		
	}
	
}


