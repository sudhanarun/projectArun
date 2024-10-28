package org.array;

public class string_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc="Java is a programming language";
		System.out.println(sc.length());
		String sc1=" python is a programming language ";
		System.out.println(sc.equals(sc1));
		System.out.println(sc.equalsIgnoreCase(sc1));
		System.out.println(sc.toUpperCase());
		System.out.println(sc.toLowerCase());
		System.out.println(sc.startsWith("Java"));
		System.out.println(sc.endsWith("language"));
		System.out.println(sc.contains(sc1));
		System.out.println(sc.indexOf("programmings"));//return -1
		System.out.println(sc.lastIndexOf("a"));
		System.out.println(sc.charAt(8));
		System.out.println(sc.replace("Java","python"));
		System.out.println(sc.substring(1));
		System.out.println(sc.concat(sc1));
		System.out.println(sc.isEmpty());
		System.out.println(sc1.trim());
		String s="happy@world";
		String[] s1=s.split("@",2);
		for(String a:s1)
			System.out.println(a);


	}

}
