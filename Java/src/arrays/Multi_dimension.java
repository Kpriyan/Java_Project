package arrays;

public class Multi_dimension {

	public static void main(String[] args) {
       
		int a [][] = new int [2][2];
		
		a[0][0]=11;
		a[0][1]=12;
		a[1][0]=13;
		a[1][1]=14;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.print(a[i][j]+ " ");
				
			}
			
		}
		 System.out.println();
		
		
		
	}

}
