package arrays;

public class Matrix_array {

	public static void main(String[] args) {
       int a[][] =
    	   {
    		   
    	   {1,2,3,4},
    	   {5,6,7,8}
    	   };
       
       int b[][]=
    		   
       {
    	   {1,2,3,4},
    	   {5,6,7,8}
       };
       
       
       int c [][]= new int [2][4];
       
       for (int i = 0; i < 2; i++) {
    	   
    	   for (int j = 0; j < 4; j++) {
    		   
    		   c[i][j]= a[i][j] + b[i][j];
    		   
    		   System.out.print(c[i][j]+ " ");
			
		}
    	   
    	   System.out.println();
		
	}
       
       
       
       
	}

}
