package org.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // Its allow the dupliate values
		List  chocolates =new ArrayList();
		chocolates.add("dairy milk");
		chocolates.add("Kitkat");
		chocolates.add("5 star");
		chocolates.add("milkybar");
		chocolates.add("milkybar");
		System.out.println(chocolates);
		chocolates.set(3,"munch");
		System.out.println(chocolates);
		chocolates.remove(0);
		System.out.println(chocolates);
		System.out.println(chocolates.get(1));
//HashSet
		Set <Integer> st=new HashSet<Integer>();
		st.add(10);
		st.add(8);
		st.add(null);
		st.add(null);
		st.add(30);
		System.out.println(st);
	//LinkedHashset	
		Set <Integer> s=new LinkedHashSet<Integer>();
		s.add(700);
		s.add(100);
		s.add(300);
		System.out.println(s);
		//TreeSet
		Set <Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(50);
		t.add(30);
		System.out.println(t);
		
	}
}