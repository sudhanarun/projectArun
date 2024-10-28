package org.keywords;
public class static1 {
     //static variable
	static int a=10;
	static int b=20;
	//static method
	public static void homeappliance()
	{
		System.out.println("Home appliance:");
	}
	static void fruits() {
		System.out.println("apple");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//its execute without create an object and its also shared memory
		homeappliance();
		System.out.println("Tv");
		System.out.println("fridge");
		System.out.println("Ac");	
		System.out.println(("sum:") + (a+b));
		fruits();
	}
}
