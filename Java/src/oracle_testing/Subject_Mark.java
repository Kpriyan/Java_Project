package oracle_testing;

import java.util.Scanner;

public class Subject_Mark {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the StudentID");
		String studentid = sc.nextLine();
		System.out.println(studentid);
		
		System.out.println("Enter the StudentName");
		String studentname = sc.nextLine();
		System.out.println(studentname);
		
		System.out.println("Enter the Marks");
		
		int m1 =sc.nextInt();
		System.out.println("subject m1 :" + m1);
		
		int m2 =sc.nextInt();
		System.out.println("subject m2 :" + m2);
		
		int m3 =sc.nextInt();
		System.out.println("subject m3 :" + m3);
		
		int m4 =sc.nextInt();
		System.out.println("subject m4 :" + m4);
		
		int m5 =sc.nextInt();
		System.out.println("subject m5 :" + m5);
		
		
		sc.close();
		
		
		

	}

}
