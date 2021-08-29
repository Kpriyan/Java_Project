package oracle_testing;



public class While_Arm_method_example {
	
	

	public static void main(String[] args) {
		
		
		int number = 370; 
		//int number = 183;
		int original = number;
		int temp ;
		int check = 0;
		
		while (number>0) {
			temp = number%10;
			check = check+(temp*temp*temp);
			number = number/10;
			
		}
		
		if (original==check) {
			System.out.println("It is a arm no");
			
		}else {
			System.out.println("It is not a arm no");
		}
		
		

	}

}
