package org.keywords;

public class hello {
	public void car() {
		System.out.println("BMW");
	}
public void bike_no(int a) {
	this.car();
	System.out.println(a);
}
public void scooty(String s) {
	this.bike_no(4000);
	System.out.println(s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
hello h=new hello();
h.scooty("Honda activa");
	}

}
