package com.String;

public class String_methods {

	public static void main(String[] args) {
		
		String name = "vinothpriyan";
		int number = 3;
		
		// 1. charAt();
		System.out.println(name.charAt(1));
		
		// 2. length();
		System.out.println(name.length());
		
		// 3.Equals();
		System.out.println(name.equals("vinothpriyan"));
		
		// 4.EqualsIgnoreCase();
		System.out.println(name.equalsIgnoreCase("VINOTHPRIYAN"));
		
		// 5.Empty();
		System.out.println(name.isEmpty());
		
		// 6.contains();letter yes or no
		//System.out.println("c");
		System.out.println(name.contains("p"));
		
		// 7. substring begin letter 
		System.out.println(name.substring(6));
		
		// 8.substring begin letter & end letter
		System.out.println(name.substring(1, 6));
		
		// 9.concat means adding the word or letter to user define name
		System.out.println(name.concat("kumar"));
		
		// 10.char letter replace();
		System.out.println(name.replace("t", "d"));
		
		// 11.total char word replace();
		System.out.println(name.replace("vinothpriyan", "Riya"));
		
		// 12.index of string type / letter place count no identify
		System.out.println(name.indexOf("i"));
		
		// 13.index of integer type /  letter place count no identify
		System.out.println(name.indexOf('a'));
		
		// 14.index of integer type/ total word i letter second time place no count guess
		System.out.println(name.indexOf('i', 2));
		
		// 15.index of string type/ priyan staring letter p place count no guess
        System.out.println(name.indexOf("priyan", 0));
        
        // 16.Trim vinothpriyan space  reduce it
        System.out.println(name.trim());
        
        // 17.string . value of number();print integer value
        System.out.println(String.valueOf(number));
        
        // 18.word join use symbols like _,@etc
        System.out.println(String.join(",","vinoth","priyan"));
        
        //19.number join use symbols /
        System.out.println(String.join("/","14","01","1995"));
        
        // 20.uppercase to lower case
        String uppercase = "VINOTHPRIYAN";
        System.out.println(uppercase.toLowerCase());
        
        // 21.lowercase to upper case
        String lowercase = "vinothpriyan";
        System.out.println(lowercase.toUpperCase());
        
        // 22.split type
        String splitword = "my, name, is ,vinothpriyan";
        String[]splitmethod=splitword.split(",");
        for (String str : splitmethod) {
        	System.out.println(str);
			
		}
        
        
           //23. startwith;   
        System.out.println(name.startsWith("vi"));
        
        //24. endswith;
        System.out.println(name.endsWith("yan"));
        
        //25. last index of method;
        System.out.println(name.lastIndexOf("i"));
        
        // another method
      boolean contains =  name.contains("p");
      System.out.println(contains);
       
	}

}
