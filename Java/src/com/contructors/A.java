package com.contructors;

public class A {
	
	float a=345.678f;
	
	
public	A(int id){
		a=id;
	}
public void StudentID() {
	System.out.println("ID:" + a);
}
	public static void main(String[] args) {
		A obj = new A(456);
		obj.StudentID();
		

	}

}
