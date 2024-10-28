package org.keywords;

public class this1 {
	int a;
	int b;
	String c;
	this1(){
		System.out.println("Addition");
	} 
	public void display( int a ,int b)
	{ 
		this.a=a;
		this.b=b;	
	}
	public void display(String c) {
		this.c=c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this1 obj=new this1();
		obj.display(10,20);
		System.out.println("Sum of the number is:"+(obj.a+obj.b));
		obj.display("Hello world");
		System.out.println(obj.c);

	}
}
