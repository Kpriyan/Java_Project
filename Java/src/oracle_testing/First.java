package oracle_testing;

public class First {
	
	
Long accountNumber= 1234567890l;
	
	String holderName= "vino";
	
	Integer accountBalance= 350;
	
	public void getBalance() {
		
		System.out.println("the Balance is"+accountBalance);
		
	  }


	public static void main(String[] args) {
		
		First account = new First();
		account.getBalance();
		
	}

}
