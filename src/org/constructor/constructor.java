package org.constructor;
//its support method overloading doesnot support overriding

public class constructor {
//no arguments constructor
	constructor()
	{
		System.out.println("I love my country India");
	}
	//parameterized constructor
	constructor (int a)
	{
this();
		System.out.println("How many number of states in India:"+a);
	}
constructor (String c){
	this(6);
		System.out.println( "my state Name is:"+c);
}
	public static void main(String[] args) {
	constructor obj =new constructor("");
	
	}

}
