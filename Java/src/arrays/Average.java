package arrays;

public class Average {

	public static void main(String[] args) {
      
		int a[]= {1,2,3,4,5};
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum = sum+a[i];
			
			double average = sum/a.length;
			
			System.out.println(average);
			
		}
		
System.out.println(".....................................");
		
        int b[]= {1,2,3,4,5};
		
		int sums = 0;
		
		for (int i = 0; i < b.length; i++) 
			
			sums = sums+b[i];
			
			double average = sums/b.length;
			
			System.out.println(average);
			
		
		
	}
		
		
		
		
	}


