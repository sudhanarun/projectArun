package polymorphism;

public class Method_overriding {
	public void dress()
	{
		System.out.println("I dont like to wear saree");

	}
	public static void main(String[] args) {
		dress1 d =new dress1();
		d.dress();	}
}
class dress1 extends Method_overriding
{
	public void dress()
	{
		System.out.println("I like to wear kurits");
	}
}

