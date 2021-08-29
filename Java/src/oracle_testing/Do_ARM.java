package oracle_testing;

public class Do_ARM {

	public static void main(String[] args) {
       
		int number = 153;
		int value = number;
		int temp;
		int check = 0;
		
		do {
			
			temp = number%10;
			check = check+(temp*temp*temp);
			number = number/10;
			
		} while (number>0);
		
		if (value==check) {
			System.out.println("It is a ARM number");
			
		}else {
			System.out.println("It is not a ARM number");
		}
		
		
		
	}

}
