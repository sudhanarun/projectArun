package polymorphism;
public class Method_overloading {
	public void stationaryitems(int a) 
	{
		System.out.println("How many stationary items are available:"+ a);
	}
	public void stationaryitems(String b,int c)
	{
		System.out.println(b+c); 
	}
	public void stationaryitems(String d,int f,int g)
	{
		System.out.println((f+g));
	}
	public void stationaryitems(String i,int c,int f,int g)
	{
		System.out.println(i+(c+f+g));
	}
	public static void main(String[] args) 
	{
		Method_overloading m =new Method_overloading();
		m.stationaryitems(2);
		m.stationaryitems("pencil:", 3);
		m.stationaryitems("Eraser:",10+10);
		m.stationaryitems("Total number of things is:",3, 10, 10);
	}
}