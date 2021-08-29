package oracle_testing;

public class Poly_overloading {
	

	public void studentdetails() {
		
		System.out.println("studentdetails");
		
	}
	
	public void studentdetails(String name) {
		System.out.println("StudentName:"+name);
		
	}
	
	public void studentdetails(int id) {
		System.out.println("StudentID:"+id);
		
	}
 
	
	

	public static void main(String[] args) {
		Poly_overloading obj = new Poly_overloading();
		obj.studentdetails();
		obj.studentdetails("vinothpriyan");
		obj.studentdetails(12412871);
		
		
		
	}

}
