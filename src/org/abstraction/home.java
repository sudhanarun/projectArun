package org.abstraction;

public interface home {
	void things1();
	void things2();
}
interface home1
{ 
	void things3();
	void things4();
}
class home2 implements home,home1
{

	public static void main(String[] args)
	{
		home2 obj =new home2();
		obj.things1();
		obj.things2();
		obj.things3();
		obj.things4();	
	}
	@Override
	public void things3() 
	{
		System.out.println("fridge");
	}
	@Override
	public void things4() {
		System.out.println("chair");
	}
	@Override
	public void things1() {
		System.out.println("tv");
	}
	@Override
	public void things2() {
		System.out.println("sofa");
	}
}

