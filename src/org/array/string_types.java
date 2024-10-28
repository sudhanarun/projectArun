package org.array;

import java.util.Scanner;

public class string_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutable
		String s=new String("world");
		StringBuffer obj=new StringBuffer("Hello");
		obj=obj.append(s);
		System.out.println(obj);
		StringBuilder obj1=new StringBuilder("I like to learn ");
		obj1=obj1.append("Java");
		System.out.println(obj1);
//immutable
		String sc="Ajith";
		Scanner scan=new Scanner(System.in);
		sc=scan.nextLine();
		System.out.println("My name is:"+sc);
	}

}
