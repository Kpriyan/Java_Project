package com.inter;
// child
public class Population implements Interface_1,Interface_2 {
	@Override
	public void Mens() {
		System.out.println("Total Population of Mens : 2000");
	}
	@Override
	public void womens() {
		
		System.out.println("Total Population of Womens : 1000");
		
	}
	@Override
    public void total() {
		
		System.out.println("Total population : 3000");
		
	}
	
	

	public static void main(String[] args) {
		
		Population totalcount = new Population();
		
		totalcount.Mens();
		totalcount.womens();
		totalcount.total();
		

	}

}
