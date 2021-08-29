package arrays;

public class Dual_sum_array {

	public static void main(String[] args) {
		
      int a[]= {12,13,14,15,16,17};
      
      int b[]= {1,2,3,4,5,6,7,};
      
      int sum =0;
      
      int sum1 =0;
      
      for (int i : b) {
    	  
		sum=sum+i;
	}
      System.out.println("b:"+ sum);
      
      for (int j : a) {
    	  
    	  sum1=sum1+j;
		
	}
      System.out.println("a:"+ sum1);
      
	}

}
