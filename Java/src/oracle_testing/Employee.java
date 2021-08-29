package oracle_testing;

public class Employee {
	
int      Id          =  1001;
String   Name        =  "vinoth";
String   Datebrith   =  "15/01/1995";
Long     PhoneNumber =  1234567891l;
String   EmailId     =  "vj123@gmail.com";
String   Address     =  "48,marry helan street , vettri nagar , chennai";
	
 public void Employeedetails () {
		System.out.println("Employee details");
		
		System.out.println("Employee Id :" +" 1001");
		System.out.println("Name :" +" vinoth");
		System.out.println("DOB :"+" 15/01/1995");
		System.out.println("phoneNumber:"+" 1234567891");
		System.out.println("EmailId :"+" vj123@gmail.com");
		System.out.println("Address :"+" 48,marry helan street , vettri nagar , chennai");
		//System.out.println("EmployeeId"+"1001"+"Name"+"vinoth");
		
		}
	
  public static void main(String[] args) {
		
		Employee detail = new Employee();
		detail.Employeedetails();
		
		
		
		
	}

}
