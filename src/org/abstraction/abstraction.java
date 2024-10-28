package org.abstraction;

public abstract class abstraction {
public abstract void studentinfo();
}
class detail extends abstraction{
	public void studentinfo1()
	{
    int number=101;
	String studentname="vijay";
	int age=24;
	System.out.println("Student number:"+number);
	System.out.println("Studnet name:"+studentname);
    System.out.println("Student age:"+age);
	}
	public static void main(String[] args) {
		detail obj =new detail();
		obj.studentinfo();
		obj.studentinfo1();
	}

	@Override
	public void studentinfo() {
		// TODO Auto-generated method stub
		System.out.println("student information");

	}
	
}
