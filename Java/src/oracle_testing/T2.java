package oracle_testing;

public class T2 {

	public static void main(String[] args) {
      
		String str = "a p j abdul kalam";
		
		int count = 0;
		
		for (int i = str.length()-1;i>=0; i--) {
			
			char ch = str.charAt(i);
			
			
			switch(ch) {
			
			case 'a':
			case 'A':	
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				
				}
			}
       System.out.println(count);
       
       // sc.close();
	}
			
		
		
		
		
		
	}


