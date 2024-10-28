package org.keywords;

public class people {
	//constructor
	people(String name){
	System.out.println(name);
	}
	//method
	public void male() {
		System.out.println("I am a male");
	}
	public void female() {
		System.out.println("I am a female");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gender g =new gender();
	}

}
class gender extends people{
	gender()
	{ 
		//using super keyword it is access the parent class reference
		//inheritance 
		super("Gender:");
		super.male();
		super.female();
		System.out.println("both male and female");
	}
}